package com.udemy.herry.learn.microservices.client.lab7.service;

import com.udemy.herry.learn.microservices.client.lab7.model.Word;

public interface WordService {
    Word getSubject();
    Word getVerb();
    Word getArticle();
    Word getAdjective();
    Word getNoun();
}
