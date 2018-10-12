package org.open.utils;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author 任传君
 * @create 2018-09-29 11:52
 **/
public class TransactionContainerUtils {

    private static volatile ConcurrentHashMap<String, List<HashMap<String, Object>>> concurrentHashMap;

    public static ConcurrentHashMap<String, List<HashMap<String, Object>>> getInstance() {
        synchronized (TransactionContainerUtils.class) {
            if (concurrentHashMap == null) {
                concurrentHashMap = new ConcurrentHashMap();
            }
        }
        System.out.println(concurrentHashMap);
        return concurrentHashMap;
    }
}
