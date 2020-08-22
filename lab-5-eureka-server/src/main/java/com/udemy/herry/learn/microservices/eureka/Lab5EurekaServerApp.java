package com.udemy.herry.learn.microservices.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Lab5EurekaServerApp {
    public static void main(String[] args) {
        SpringApplication.run(Lab5EurekaServerApp.class, args);
    }
}
