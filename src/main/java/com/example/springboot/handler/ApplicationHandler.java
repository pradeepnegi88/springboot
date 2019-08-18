package com.example.springboot.handler;

import com.example.springboot.exception.InvalidFieldException;
import com.example.springboot.exception.InvalidHeaderException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApplicationHandler {

    @ExceptionHandler
    public String handleInvalidFieldException(InvalidFieldException invalidFieldException) {
        return invalidFieldException.getMessage();
    }

    @ExceptionHandler
    public ResponseEntity<String> handleInvalidHeaderException(InvalidHeaderException invalidFieldException) {
        return new ResponseEntity<>(invalidFieldException.getMessage(), HttpStatus.PRECONDITION_FAILED);
    }
}
