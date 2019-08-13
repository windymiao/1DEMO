package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello1Controller {
    @RequestMapping("/hello")
    public String Hello(){
        return "Hello Stringboot";
    }
}
