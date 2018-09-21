package org.open.tcc.interceptor;

import org.open.tcc.model.TransactionLocal;
import org.open.utils.UUIDUtils;
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
     * @return
     * @param code
     */
    public void around(int code) throws Throwable {
        String groupId = null;
        String mode = null;
        try {
            RequestAttributes requestAttributes = RequestContextHolder.currentRequestAttributes();
            HttpServletRequest request = requestAttributes == null ? null : ((ServletRequestAttributes) requestAttributes).getRequest();
            if(1 == code){
                groupId = UUIDUtils.uuid();
            }else{
                groupId = request == null ? null : request.getHeader("tx-group");
                mode = request == null ? null : request.getHeader("tx-mode");
            }
            TransactionLocal transactionLocal = new TransactionLocal();
            transactionLocal.setGroupId(groupId);
            TransactionLocal.setCurrent(transactionLocal);
            System.out.println("groupId :"+groupId);
            System.out.println("mode :"+mode);
            System.out.println("提交事务组到rockmq");
        }catch (Exception e){}
    }
}
