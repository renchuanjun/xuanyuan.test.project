package org.open;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;
import io.netty.util.CharsetUtil;
import io.netty.util.ReferenceCountUtil;
import org.open.model.TransactionManager;
import org.open.service.TransactionGroup;
import org.open.service.impl.TransactionGroupImpl;
import org.open.utils.JsonUtils;


/**
 * @author 任传君
 * @create 2018-09-29 10:05
 * 服务端数据接收
 **/
public class ReceiveServerHabdler extends ChannelHandlerAdapter {


    /**
     * 这里我们覆盖了chanelRead()事件处理方法。 每当从客户端收到新的数据时， 这个方法会在收到消息时被调用，
     * 这个例子中，收到的消息的类型是ByteBuf
     * @param ctx 通道处理的上下文信息
     * @param msg 接收的消息
     */
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        super.channelRead(ctx, msg);
        try {
            ByteBuf in = (ByteBuf) msg;
            // 打印客户端输入，传输过来的的字符
            System.out.print(in.toString(CharsetUtil.UTF_8));
            String str = in.toString(CharsetUtil.UTF_8);
            TransactionManager transactionManager = (TransactionManager) JsonUtils.DeserializeJson(str,TransactionManager.class);
            TransactionGroup transactionGroup = new TransactionGroupImpl();
            if(null != transactionManager){
                int transactionalRole = transactionManager.getTransactionalRole();//获取事务组角色1, "发起者" 2, "本地执行"
                if(1 == transactionalRole){
                    transactionGroup.creatGroup(transactionManager);
                }
                if (2 == transactionalRole){
                    transactionGroup.addGroup(transactionManager);
                }
            }
            //如果是"QUERY TIME ORDER"则创建应答消息
            String currentTime = "success";
            ByteBuf resp = Unpooled.copiedBuffer(currentTime.getBytes());
            ctx.writeAndFlush(resp).addListener(ChannelFutureListener.CLOSE).sync();
        } finally {
            /**
             * ByteBuf是一个引用计数对象，这个对象必须显示地调用release()方法来释放。
             * 请记住处理器的职责是释放所有传递到处理器的引用计数对象。
             */
            // 抛弃收到的数据
            ReferenceCountUtil.release(msg);

        }
    }





}
