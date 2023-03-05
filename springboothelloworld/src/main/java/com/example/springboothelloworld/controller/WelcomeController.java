package com.example.springboothelloworld.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class WelcomeController {

    @RequestMapping("/welcome")
    public String welcome(){
        return "Hi welcome to spring with aws";
    }
}
