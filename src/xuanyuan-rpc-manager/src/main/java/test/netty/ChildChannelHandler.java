package test.netty;


import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.LineBasedFrameDecoder;
import io.netty.handler.codec.stomp.StompSubframeDecoder;

/**
 * @author 任传君
 * @create 2018-09-26 10:30
 **/
public class ChildChannelHandler extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel arg0){
        arg0.pipeline().addLast(new LineBasedFrameDecoder(1024));
        arg0.pipeline().addLast(new StompSubframeDecoder());
        arg0.pipeline().addLast(new TimeServerHandler());
    }
}
