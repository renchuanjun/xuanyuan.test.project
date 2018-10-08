package test.io;

/**
 * @author 任传君
 * @create 2018-09-21 14:56
 **/
public class TimeServer {

    public static void main(String[] args) {
        int prot = 8000;
        if (null != args && 0 < args.length) {
            prot = Integer.valueOf(args[0]);
        }
        MultiplexerTimeServer multiplexerTimeServer = new MultiplexerTimeServer(prot);
        new Thread(multiplexerTimeServer, "测试").start();
    }
}
