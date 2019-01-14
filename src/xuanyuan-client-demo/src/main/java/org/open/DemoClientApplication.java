package org.open;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients //注解开启Feign功能
@EnableConfigurationProperties({ConfigProperties.class})
public class DemoClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoClientApplication.class, args);
    }
}
