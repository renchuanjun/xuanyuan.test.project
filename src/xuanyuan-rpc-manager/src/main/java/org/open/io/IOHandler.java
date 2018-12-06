package org.open.io;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;
import org.open.utils.TransactionContainerUtils;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;


/**
 * @author 任传君
 * @create 2018-10-16 17:54
 **/
public class IOHandler extends ChannelHandlerAdapter {




    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {

        //将msg转换成Netty的ByteBuf对象
        ByteBuf buf = (ByteBuf)msg;
        //将缓冲区中的字节数组复制到新建的byte数组中，
        byte[] req = new byte[buf.readableBytes()];
        buf.readBytes(req);
        //获取请求消息
        String body = new String(req,"UTF-8").substring(0,req.length-System.getProperty("line.separator").length());
        System.out.println("The time server receive order:" + body);

        String currentTime = "QUERY TIME ORDER".equalsIgnoreCase(body) ? new java.util.Date(
                System.currentTimeMillis()).toString() : "BAD ORDER";
        ByteBuf resp = Unpooled.copiedBuffer(currentTime.getBytes());

        ConcurrentHashMap<String,List<HashMap<String,Object>>> concurrentHashMap =  TransactionContainerUtils.getInstance();

        //异步发送应答消息给客户端(不会断开连接)
        ctx.channel().writeAndFlush(resp).sync();
        //响应结束后断开与客户端的链接
//        ctx.writeAndFlush(resp).addListener(ChannelFutureListener.CLOSE).sync();
    }
}
