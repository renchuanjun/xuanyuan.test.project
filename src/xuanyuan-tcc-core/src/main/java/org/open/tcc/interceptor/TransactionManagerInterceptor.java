package org.open.tcc.interceptor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.open.tcc.model.TransactionLocal;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 任传君
 * @create 2018-09-10 10:58
 **/
@Component
public class TransactionManagerInterceptor {

    /**
     * 封装事务基本信息
     * @param point
     * @return
     */
    public Object around(ProceedingJoinPoint point) throws Throwable {
        String groupId = null;
        String mode = null;
        try {
            RequestAttributes requestAttributes = RequestContextHolder.currentRequestAttributes();
            HttpServletRequest request = requestAttributes == null ? null : ((ServletRequestAttributes) requestAttributes).getRequest();
            groupId = request == null ? null : request.getHeader("tx-group");
            mode = request == null ? null : request.getHeader("tx-mode");
            TransactionLocal transactionLocal = new TransactionLocal();
            transactionLocal.setGroupId("11111111");
            TransactionLocal.setCurrent(transactionLocal);
            System.out.println("groupId :"+groupId);
            System.out.println("mode :"+mode);
        }catch (Exception e){}

        return point.proceed();
    }
}
