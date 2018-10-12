package org.open.tcc.model;

/**
 * @author 任传君
 * @create 2018-09-11 16:10
 **/
public class TransactionLocal {

    private String groupId;

    private final static ThreadLocal<TransactionLocal> currentLocal = new ThreadLocal<>();

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public static TransactionLocal current() {
        return currentLocal.get();
    }

    public static void setCurrent(TransactionLocal current) {
        currentLocal.set(current);
    }
}
