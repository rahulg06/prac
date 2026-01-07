package com.project.project1.exceptionhandler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandler extends Exception{
    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
    public String caughtException(){
        return "Exception Occured Now";
    }
}
