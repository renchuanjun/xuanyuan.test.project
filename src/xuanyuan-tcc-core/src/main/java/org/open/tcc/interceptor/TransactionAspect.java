package org.open.tcc.interceptor;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.open.tcc.annotation.MyTransactional;
import org.open.tcc.enums.TransactionalRoleEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author 任传君
 * @create 2018-09-10 10:51
 * 事务拦截器
 **/
@Aspect
@Component
public class TransactionAspect{

    @Autowired
    private TransactionManagerInterceptor transactionManagerInterceptor;

    @Pointcut("@annotation(org.open.tcc.annotation.MyTransactional)")
    public void pointCut(){
    }

    /**
     * 之前
     * @param joinPoint
     */
    @Before(value = "pointCut()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
/*        Signature signature = joinPoint.getSignature();
        MethodSignature methodSignature = (MethodSignature)signature;
        Method targetMethod = methodSignature.getMethod();
        Class clazz = targetMethod.getClass();
        System.out.println(clazz.isAnnotationPresent(MyTransactional.class));
        MyTransactional myTransactional = (MyTransactional)clazz.getAnnotation(MyTransactional.class);*/

        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        //从切面中获取当前方法
        Method method = signature.getMethod();
        //得到了方,提取出他的注解
        MyTransactional action = method.getAnnotation(MyTransactional.class);
        //输出
        System.out.println("注解式拦截:" + action.role()[0].getCode());
        this.transactionManagerInterceptor.around(action.role()[0].getCode());
    }

    /***
     * 之后
     * @param joinPoint
     */
    @After(value = "pointCut()")
    public void doAfter(JoinPoint joinPoint) {
        System.out.println("______doAfter");
    }

    /***
     * 返回
     * @param joinPoint
     * @param returnValue
     */
    @AfterReturning(value = "pointCut()", returning = "returnValue")
    public void afterReturning(JoinPoint joinPoint, Object returnValue) {
        System.out.println("____afterReturning");
    }








}
