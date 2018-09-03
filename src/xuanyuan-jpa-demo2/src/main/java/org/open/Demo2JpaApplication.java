package org.open;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication //是一个spring boot项目
@EnableAutoConfiguration
@EnableConfigurationProperties({ConfigProperties.class})
public class Demo2JpaApplication {
    public static void main(String[] args) {
        SpringApplication.run(Demo2JpaApplication.class, args);
    }
}
