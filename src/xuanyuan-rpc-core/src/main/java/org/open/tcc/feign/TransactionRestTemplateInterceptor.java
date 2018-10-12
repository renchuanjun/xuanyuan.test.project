package org.open.tcc.feign;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.open.tcc.model.TransactionLocal;
import org.springframework.stereotype.Component;

/**
 * @author 任传君
 * @create 2018-09-11 17:48
 **/
@Component
public class TransactionRestTemplateInterceptor implements RequestInterceptor {



    public TransactionRestTemplateInterceptor() {
    }

    @Override
    public void apply(RequestTemplate requestTemplate) {
        TransactionLocal transactionLocal = TransactionLocal.current();
        String groupId = transactionLocal.getGroupId();
        System.out.println(groupId);
        if (transactionLocal != null) {
            requestTemplate.header("tx-group", groupId);
        }
    }
}
