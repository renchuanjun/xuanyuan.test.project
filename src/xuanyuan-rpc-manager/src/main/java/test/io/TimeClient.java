package test.io;

/**
 * @author 任传君
 * @create 2018-09-25 11:20
 **/
public class TimeClient {



    public static void main(String[] args) {
        int port = 8000;
        if(args!=null && args.length>0){
            port = Integer.valueOf(args[0]);
        }
        new Thread(new TimeClientHandler("localhost", port)).start();
    }


}
