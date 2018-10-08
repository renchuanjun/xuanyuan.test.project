package org.open.configuration;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Properties;

/**
 * @author 任传君
 * @create 2018-09-30 14:12
 **/
public class Configuration {

    private static Configuration configuration = null;

    private Configuration() {}

    public static Configuration getConfiguration(){
        if (null == configuration){
            configuration = new Configuration();
        }
        return configuration;
    }

    public  String getSystemConfig(String key){
        String value = "";
        InputStream is = null;
        try {
            Properties prop = new Properties();
            is = Configuration.class.getResourceAsStream("/config.properties");
            prop.load(is);
            Iterator<String> it = prop.stringPropertyNames().iterator();
            while (it.hasNext()) {
                if (it.next().equals(key)) {
                    value = prop.getProperty(key);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(null != is){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return value;
    }

}
