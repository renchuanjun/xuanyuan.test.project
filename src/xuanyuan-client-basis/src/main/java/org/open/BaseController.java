package org.open;


import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.*;



/**
 * Created by lenovo on 2017/4/10.
 */
public class BaseController {

    @Autowired
    protected HttpServletRequest request;

    @Autowired
    protected HttpServletResponse response;
    

    protected String outJsonStringSuccess() {
        return "success";
    }

    protected String outJsonStringFail() {
        return "fail";
    }

    protected String outJsonStringFail(String msg) {
        return "fail:" + msg;
    }

    protected String outJsonStringValidateFail() {
        return "validatefail";
    }

    /**
     * 针对分页拼接成列表对应的json串
     *
     * @param total
     * @param json
     * @return
     */
    protected String SetTableDataJson(int total, String json) {
        String str = "{\"total\":" + total + ",\"rows\":" + json + "}";
        return str;
    }
    
  
}
