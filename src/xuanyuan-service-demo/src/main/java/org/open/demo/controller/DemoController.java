package org.open.demo.controller;

import org.open.BaseController;
import org.open.demo.service.IDemoService;
import org.open.model.XYResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 任传君
 * @create 2018-08-30 16:18
 **/
@RestController
@RequestMapping("/demo")
public class DemoController extends BaseController {

    @Autowired
    private IDemoService demoService;

    @ResponseBody
    @RequestMapping(value = "/getdemo", method = RequestMethod.POST)
    public XYResult<Object> demo(Integer id){
        XYResult<Object> xyResult = this.demoService.getDemo(id);
        return xyResult;
    }
}
