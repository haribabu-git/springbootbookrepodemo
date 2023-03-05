package com.example.springdemo.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;
import org.springframework.core.env.*;
import org.springframework.stereotype.*;

@Component
@Profile("dev")
public class MyBean {

    /*@Autowired
    private Environment environment;*/
    @Value("${spring.local.properties}")
    String message;

    public MyBean(){
        System.out.println("welcome to Mybean"+message /*environment.getProperty("spring.local.properties")*/);
    }
}
