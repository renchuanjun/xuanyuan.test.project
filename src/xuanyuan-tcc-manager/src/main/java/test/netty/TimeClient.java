package test.netty;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

/**
 * @author 任传君
 * @create 2018-09-26 14:24
 **/
public class TimeClient {

    public void connect(int port, String host) throws InterruptedException {
        //配置客户端NIO 线程组
        EventLoopGroup group = new NioEventLoopGroup();
        Bootstrap client = new Bootstrap();
        try {
            client.group(group)
                    .channel(NioSocketChannel.class)
                    .option(ChannelOption.TCP_NODELAY, true)
                    .handler(new ClientChannelHandler());
            //绑定端口, 异步连接操作
            ChannelFuture future = client.connect(host, port).sync();
            //等待客户端连接端口关闭
            Channel channel = future.channel();
            channel.closeFuture().sync();
        } finally {
            //优雅关闭 线程组
            group.shutdownGracefully();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int port = 8000;
        if(null != args && 0 < args.length){
            port = Integer.valueOf(args[0]);
        }
        new TimeClient().connect(port,"localhost");
    }
}















































