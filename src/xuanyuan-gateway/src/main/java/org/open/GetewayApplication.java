package org.open;

import org.open.fileter.MyFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;

/**
 * Hello world!
 */



@EnableEurekaClient
@SpringBootApplication
@EnableHystrix
@EnableCircuitBreaker //注解开启断路器功能
public class GetewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GetewayApplication.class, args);
    }


    @Bean
    public MyFilter preFilter(){
        return new MyFilter();
    }
}
