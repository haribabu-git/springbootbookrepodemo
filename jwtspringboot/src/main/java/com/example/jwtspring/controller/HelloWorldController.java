package com.example.jwtspring.controller;


import com.example.jwtspring.config.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {
    @Autowired
    JwtTokenUtil jwtTokenUtil;

    @RequestMapping(value = "/hello")
    public String firstPage(){
       String s = jwtTokenUtil.generateToken("haribabu");
        return "welcome message JWT-Spring and toke is "+s;
    }
}
