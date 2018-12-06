package org.open.io;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.LineBasedFrameDecoder;
import io.netty.handler.codec.stomp.StompSubframeDecoder;


/**
 * @author 任传君
 * @create 2018-09-28 18:06
 **/
public class ChildChannelHandler  extends ChannelInitializer<SocketChannel> {


    @Override
    protected void initChannel(SocketChannel channel) throws Exception {
        channel.pipeline().addLast(new LineBasedFrameDecoder(1024));
        channel.pipeline().addLast(new StompSubframeDecoder());
        channel.pipeline().addLast(new IOHandler());
    }
}
