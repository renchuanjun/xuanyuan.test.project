package org.open.tcc.annotation;


import org.open.tcc.enums.TransactionalRoleEnum;
import org.open.tcc.enums.TransactionalTypeEnum;
import org.springframework.web.bind.annotation.Mapping;

import java.lang.annotation.*;

/**
 * @author 任传君
 * @create 2018-07-27 16:54
 **/
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Mapping
public @interface MyTransactional {

    /**
     * 事务类型
     * @return
     */
    TransactionalTypeEnum[] transactionalType() default {};

    /**
     * 业务角色
     * @return
     */
    TransactionalRoleEnum[] role() default {};


}
