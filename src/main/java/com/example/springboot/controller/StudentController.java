package com.example.springboot.controller;

import com.example.springboot.exception.InvalidFieldException;
import com.example.springboot.model.Student;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {
    @PostMapping
    public String saveStudent(@RequestBody Student student) {
        if (StringUtils.isEmpty(student.getLastName())) {
            throw new InvalidFieldException("Last name is a required field.");
        }
        return "Student is saved!!!.";
    }

    @ExceptionHandler
    public String handleInvalidFieldException(InvalidFieldException invalidFieldException) {
        return invalidFieldException.getMessage();
    }
}
