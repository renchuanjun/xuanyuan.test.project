package org.open.demo.controller;


import org.apache.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author 任传君
 * @create 2018-12-17 16:31
 **/
@Component
public class Demo3Task {

    private Logger logger = Logger.getLogger(Demo3Task.class);

    @Scheduled(cron = "0/10 * * * * ?")
    public void startTask() {
        
        logger.error("测试数据");
    }
}
