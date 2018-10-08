package org.open.service;

import org.open.model.TransactionManager;

public interface TransactionGroup {

    void creatGroup(TransactionManager transactionManager);

    void addGroup(TransactionManager transactionManager);

    void delGroup(TransactionManager transactionManager);
}
