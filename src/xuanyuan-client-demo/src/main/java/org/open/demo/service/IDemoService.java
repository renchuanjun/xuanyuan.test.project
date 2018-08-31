package org.open.demo.service;

import org.open.demo.service.hystrix.DemoHystrix;
import org.open.model.XYResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 任传君
 * @create 2018-08-30 11:24
 **/
@FeignClient(value = "${gateway.demo}",fallback= DemoHystrix.class)
public interface IDemoService {

    @RequestMapping(value = "/demo/getdemo", method = RequestMethod.POST )
    XYResult<Object> getDemo(@RequestBody String name);
}
