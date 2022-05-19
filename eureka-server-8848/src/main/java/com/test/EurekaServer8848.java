package com.test;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 蒙得犬
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer8848 {
    public static void main(String[] args){
        SpringApplication.run(EurekaServer8848.class,args);
    }
}
