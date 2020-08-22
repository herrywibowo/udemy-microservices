package com.udemy.herry.learn.microservices.lab8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Lab8ConfigServerApp {
    public static void main(String[] args) {
        SpringApplication.run(Lab8ConfigServerApp.class, args);
    }
}
