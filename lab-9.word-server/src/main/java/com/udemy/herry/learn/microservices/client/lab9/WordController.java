package com.udemy.herry.learn.microservices.client.lab9;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class WordController {
    private final Random random = new Random();

    @Value("${words}") String[] words;

    @GetMapping("/")
    public Word getWord() {
        return new Word(words[random.nextInt(words.length)]);
    }
}
