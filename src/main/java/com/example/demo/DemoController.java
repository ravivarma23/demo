package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/")
    public String hello(){
        return "Hello Jimmy!";
    }

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello Bootcamp";
    }

}
