package com.udemy.herry.learn.microservices.client.lab7.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.udemy.herry.learn.microservices.client.lab7.dao.*;
import com.udemy.herry.learn.microservices.client.lab7.model.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WordServiceImpl implements WordService {

    @Autowired
    VerbClient verbClient;
    @Autowired
    SubjectClient subjectClient;
    @Autowired
    ArticleClient articleClient;
    @Autowired
    AdjectiveClient adjectiveClient;
    @Autowired
    NounClient nounClient;

    @HystrixCommand(fallbackMethod = "getFallbackSubject")
    public Word getSubject() {
        return subjectClient.getWord();
    }

    public Word getFallbackSubject(){
        return new Word("SomeOne");
    }

    public Word getVerb() {
        return verbClient.getWord();
    }

    public Word getArticle() {
        return articleClient.getWord();
    }

    public Word getAdjective() {
        return adjectiveClient.getWord();
    }

    public Word getNoun() {
        return nounClient.getWord();
    }
}
