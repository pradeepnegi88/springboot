package com.example.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/initial")
public class InitialController {
    @GetMapping
    public String getInitial(){
        return "This is the default controller response";
    }
}
