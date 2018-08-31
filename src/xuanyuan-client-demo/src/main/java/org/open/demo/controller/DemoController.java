package org.open.demo.controller;

import org.open.BaseController;
import org.open.demo.service.IDemoService;
import org.open.model.XYResult;
import org.open.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 任传君
 * @create 2018-08-30 11:19
 **/
@Controller
@RequestMapping("/demo")
public class DemoController extends BaseController {

    @Autowired
    private IDemoService demoService;

    @ResponseBody
    @RequestMapping(value = "/demo", method = RequestMethod.POST)
    public String demo(String name){
        XYResult<Object> xyResult = this.demoService.getDemo("姓名 : " + name);
        return JsonUtils.SerializeJson(xyResult);
    }
}
