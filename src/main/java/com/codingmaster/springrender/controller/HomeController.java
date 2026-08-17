package com.codingmaster.springrender.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    public  String home(){
        return  "Spring app deployed to aws Ec2 and S3";
    }
    @GetMapping("/welcome")
    public String getWelcomeMessage() {
        return "Welcome to this session.!";
    }

    @GetMapping("/getmessage")
    public String getMessage() {
        return "This is message.";
    }

    @GetMapping("/greetings")
    public String getGreetings() {
        return "Welcome to Spring application.";
    }

    @GetMapping("/custom")
    public String getCustomMessage() {
        return "Custom message endpoint.";
    }


}
