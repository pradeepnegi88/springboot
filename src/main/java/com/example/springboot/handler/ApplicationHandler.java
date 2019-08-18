package com.example.springboot.handler;

import com.example.springboot.exception.InvalidFieldException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApplicationHandler {

    @ExceptionHandler
    public String handleInvalidFieldException(InvalidFieldException invalidFieldException) {
        return invalidFieldException.getMessage();
    }
}
