package org.open.demo.controller;

import org.open.BaseController;
import org.open.model.XYResult;
import org.springframework.web.bind.annotation.*;

/**
 * @author 任传君
 * @create 2018-08-30 16:18
 **/
@RestController
@RequestMapping("/demo")
public class DemoController extends BaseController {



    @ResponseBody
    @RequestMapping(value = "/getdemo", method = RequestMethod.POST)
    public XYResult<Object> demo(@RequestBody String name){
        XYResult<Object> xyResult = new XYResult<>();
        xyResult.setResult(name+ ": 访问服务端");
        xyResult.setSuccess(true);
        return xyResult;
    }
}
