package com.spring.RestAPIQuestions.Question6;

public class BookNotFoundException extends RuntimeException {

    public BookNotFoundException(String message) {
        super(message);
    }
}