package com.udemy.herry.learn.microservices.client.lab9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Lab9Word {

    public static void main(String[] args) {
        SpringApplication.run(Lab9Word.class, args);
    }

}
