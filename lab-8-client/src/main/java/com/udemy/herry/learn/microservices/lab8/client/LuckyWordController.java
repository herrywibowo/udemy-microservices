package com.udemy.herry.learn.microservices.lab8.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConfigurationProperties(prefix = "word-config")
public class LuckyWordController {

    String luckyWord;

    @GetMapping("/lucky-word")
    public String showLuckyWord() {
        return "The lucky word is: " + luckyWord;
    }

    public String getLuckyWord() {
        return luckyWord;
    }

    public void setLuckyWord(String luckyWord) {
        this.luckyWord = luckyWord;
    }
}