package com.example.springdemo.controller;

import lombok.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.autoconfigure.condition.*;
import org.springframework.boot.context.properties.*;
import org.springframework.context.annotation.*;
import org.springframework.core.env.*;
import org.springframework.web.bind.annotation.*;



@Data
@ConfigurationProperties("spring.local")
@Profile({"dev"})
@RestController
public class Mycontroller {

    /*@Value("${spring.local.properties}")
    String message;*/

    @Autowired
    private Environment environment;

    private String properties;



    @RequestMapping("/")
    public String mapping(){
        return "welcome to controller"+properties;
    }
}
