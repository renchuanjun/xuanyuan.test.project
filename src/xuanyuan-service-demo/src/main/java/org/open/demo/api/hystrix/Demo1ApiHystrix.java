package org.open.demo.api.hystrix;

import org.open.demo.api.IDemo1Api;
import org.open.model.XYResult;
import org.springframework.stereotype.Component;

/**
 * @author 任传君
 * @create 2018-09-03 14:29
 **/
@Component
public class Demo1ApiHystrix implements IDemo1Api {
    @Override
    public XYResult<Object> getDemo(Integer id) {
        XYResult<Object> xyResult = new XYResult<>();
        System.out.println(id + "进入断路器1");
        xyResult.setResult("进入断路器");
        xyResult.setStateCode("-9999");
        return xyResult;
    }
}
