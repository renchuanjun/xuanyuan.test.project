package org.open.demo.service.impl;

import org.open.demo.api.IDemo1Api;
import org.open.demo.service.IDemoService;
import org.open.model.XYResult;
import org.open.tcc.annotation.MyTransactional;
import org.open.tcc.enums.TransactionalRoleEnum;
import org.open.tcc.enums.TransactionalTypeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Random;

/**
 * @author 任传君
 * @create 2018-09-03 14:27
 **/
@Service(value = "iDemoService")
public class DemoServiceImpl implements IDemoService {

    @Autowired
    private IDemo1Api demo1Api;


    @Override
    @Transactional
    @MyTransactional(transactionalType = TransactionalTypeEnum.COERCIVE_IDENTUCAL,role = TransactionalRoleEnum.START)
    public XYResult<Object> getDemo(Integer id) {
        XYResult<Object> xyResult = new XYResult<>();
        try {
            XYResult<Object> result = this.demo1Api.getDemo(id);
            if (result.getSuccess()){
                Object obj = result.getResult();
                xyResult.setResult(obj);
                xyResult.setDetailInfo("service 拼装数据");
                xyResult.setSuccess(true);
            }
        }catch (Exception e){

        }
        return xyResult;
    }
}
