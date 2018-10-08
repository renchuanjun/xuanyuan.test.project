package org.open;


import org.open.config.SystemConfig;

/**
 * @author 任传君
 * @create 2018-09-17 14:05
 **/
public class ManagerStart {


    public static void main(String [] arge){
//        String home = SystemConfig.getHomePath();
//        if(null == home){
//            System.out.println("is not set.");
//            System.exit(-1);
//        }
        try {
            ManagerServer managerServer = ManagerServer.getInstance();
            managerServer.setPort(8000);
            managerServer.startup();
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }
}
