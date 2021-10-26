package com.zk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class DogClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(DogClientApplication.class,args);
    }
}
