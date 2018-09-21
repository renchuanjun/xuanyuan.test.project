package test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

/**
 * @author 任传君
 * @create 2018-09-21 15:07
 **/
public class MultiplexerTimeServer implements Runnable {

    private Selector selector;

    private ServerSocketChannel serverChannel;

    private volatile boolean stop;

    private int prot;

    public MultiplexerTimeServer(int prot) {
        try {
            this.prot = prot;
            this.selector = Selector.open();
            this.serverChannel = ServerSocketChannel.open();
            serverChannel.configureBlocking(false);
            serverChannel.socket().bind(new InetSocketAddress(prot), 1024);
            serverChannel.register(selector, SelectionKey.OP_ACCEPT);
            System.out.println("The Time server is start in prot :" + prot);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    @Override
    public void run() {
        while (!stop) {
            try {
                selector.select(1000);
                Set<SelectionKey> selectionKeys = selector.selectedKeys();
                Iterator<SelectionKey> it = selectionKeys.iterator();
                SelectionKey key = null;
                while (it.hasNext()) {
                    key = it.next();
                    it.remove();
                    try {
                        handleInput(key);
                    }catch (Exception e){
                        if(null != key){
                            key.cancel();
                            if (null != key.channel())
                                key.channel().close();
                        }
                    }
                }
            } catch (Throwable e) {
                e.printStackTrace();

            }
        }
        if (null != selector ){
            try {
                selector.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void handleInput(SelectionKey key) throws IOException {
        if(key.isValid()){
            //处理新接入的请求消息
            if (key.isAcceptable()) {
                ServerSocketChannel ssc = (ServerSocketChannel) key.channel();
                SocketChannel sc = ssc.accept();
                sc.configureBlocking(false);
                sc.register(selector,SelectionKey.OP_ACCEPT);
            }
            if (key.isReadable()){
                SocketChannel sc = (SocketChannel) key.channel();
                ByteBuffer readBuff = ByteBuffer.allocate(1024);
                int readbytes = sc.read(readBuff);
                if (0 < readbytes ){
                    readBuff.flip();
                    byte[] bytes = new byte[readBuff.remaining()];
                    readBuff.get(bytes);
                    String body = new String(bytes,"UTF-8");
                    System.out.println("the time server receive order:" + body);
                    String date = new Date(System.currentTimeMillis()).toString();
                    String currentTime = "QUERY TIME ORDER".equalsIgnoreCase(body) ? date :"BAD ORDER";
                    dowrite(sc,currentTime);
                }else if(0 > readbytes ){
                    key.cancel();
                    sc.close();
                }else {
                    ;//读到0字节，忽略
                }
            }
        }
    }

    public void dowrite(SocketChannel channel ,String response) throws IOException {
        if(null != response && 0 < response.trim().length()){
            byte[] bytes = response.getBytes();
            ByteBuffer writeBuffer = ByteBuffer.allocate(bytes.length);
            writeBuffer.put(bytes);
            writeBuffer.flip();
            channel.write(writeBuffer);
        }
    }
}























































