package org.open.demo.api;

import org.open.demo.api.hystrix.Demo1ApiHystrix;
import org.open.model.XYResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "${jpa.demo1}",fallback= Demo1ApiHystrix.class)
public interface IDemo1Api {


    @RequestMapping(value = "/demo/getdemo", method = RequestMethod.POST )
    XYResult<Object> getDemo(@RequestBody Integer id);
}
