package org.open;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ImportResource;


@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients //注解开启Feign功能
@EnableAutoConfiguration
@EnableConfigurationProperties({ConfigProperties.class})
//@ImportResource({"classpath:applicationContext.xml"})
public class DemoServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoServiceApplication.class, args);
    }
}
