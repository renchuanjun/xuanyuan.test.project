package org.open;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 */



@EnableEurekaClient
@SpringBootApplication
public class GetewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GetewayApplication.class, args);
    }
}
