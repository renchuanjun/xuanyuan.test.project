package org.open.demo.service.impl;

import org.open.demo.dao.Hotnews1Mapper;
import org.open.demo.model.Hotnews1;
import org.open.demo.service.IDemo1Service;
import org.open.model.XYResult;
import org.open.tcc.annotation.MyTransactional;
import org.open.tcc.enums.TransactionalRoleEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 任传君
 * @create 2018-09-03 11:29
 **/
@Service(value = "iDemo1Service")
public class Demo1ServiceImpl implements IDemo1Service {

    @Autowired
    private Hotnews1Mapper hotnews1Mapper;


    @MyTransactional(role=TransactionalRoleEnum.LOCAL)
    public XYResult<Object> getDemo1(Integer id){
        XYResult<Object> xyResult = new XYResult<>();
        try {
            Hotnews1 hotnews1 = this.hotnews1Mapper.selectByPrimaryKey(id);
            xyResult.setResult(hotnews1);
            xyResult.setSuccess(true);
        }catch (Exception e){
            xyResult.setException(e);
        }
        return  xyResult;
    }
}
