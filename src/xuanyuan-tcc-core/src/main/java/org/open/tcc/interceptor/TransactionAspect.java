package org.open.tcc.interceptor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * @author 任传君
 * @create 2018-09-10 10:51
 * 事务拦截器
 **/
@Aspect
@Component
public class TransactionAspect implements Ordered {

    @Autowired
    private TransactionManagerInterceptor transactionManagerInterceptor;

    @Around("@annotation(org.open.tcc.annotation.MyTransactional)")
    public Object transactionRunning(ProceedingJoinPoint point)throws Throwable{
        Object obj =  transactionManagerInterceptor.around(point);
        return obj;
    }

    @Override
    public int getOrder() {
        return 1000;
    }
}
