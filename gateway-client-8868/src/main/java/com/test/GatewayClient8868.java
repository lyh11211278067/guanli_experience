package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 蒙得犬
 */

@SpringBootApplication
@EnableEurekaClient
public class GatewayClient8868 {
    public static void main(String[] args){
        SpringApplication.run(GatewayClient8868.class,args);
    }
}