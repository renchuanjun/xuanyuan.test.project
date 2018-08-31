package org.open.demo.service.hystrix;

import org.open.demo.service.IDemoService;
import org.open.model.XYResult;
import org.springframework.stereotype.Component;

/**
 * @author 任传君
 * @create 2018-08-30 11:25
 **/
@Component
public class DemoHystrix implements IDemoService {


    @Override
    public XYResult<Object> getDemo(String s) {
        XYResult<Object> xyResult = new XYResult<>();
        System.out.println(s + "进入断路器");
        xyResult.setResult("进入断路器");
        xyResult.setStateCode("-9999");
        return xyResult;
    }
}
