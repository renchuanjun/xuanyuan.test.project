package org.open.model;

/**
 * @author 任传君
 * @create 2018-09-29 11:29
 **/
public class TransactionManager {

    private String groupId;

    private int TransactionalRole;

    private Object obj;

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public int getTransactionalRole() {
        return TransactionalRole;
    }

    public void setTransactionalRole(int transactionalRole) {
        TransactionalRole = transactionalRole;
    }
}
