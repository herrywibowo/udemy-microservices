package com.udemy.herry.learn.microservices.eureka.client.lab6.dao;

import com.udemy.herry.learn.microservices.eureka.client.lab6.model.Word;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("LAB-5-VERB")
public interface VerbClient {
    @GetMapping("/")
    public Word getWord();
}
