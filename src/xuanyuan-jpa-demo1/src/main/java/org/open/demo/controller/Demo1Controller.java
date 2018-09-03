package org.open.demo.controller;

import org.open.BaseController;
import org.open.demo.service.IDemo1Service;
import org.open.model.XYResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 任传君
 * @create 2018-09-03 11:28
 **/
@RestController
@RequestMapping("/demo")
public class Demo1Controller extends BaseController {

    @Autowired
    private IDemo1Service demo1Service;

    @RequestMapping(value = "/getdemo" ,method = RequestMethod.POST)
    public XYResult<Object> getDemo(Integer id){
        return this.demo1Service.getDemo1(id);






























































    }
}
