package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
    @GetMapping("/")
    public  String home(){
        return "From Home, welcome";
    }
    @GetMapping("/hello")
    public String hello(){
        return "Hello Controller ";
    }
}
