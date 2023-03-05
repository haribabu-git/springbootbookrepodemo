package com.example.springsecuriteyapplication.controller;


import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @RequestMapping(value = "/log")
    public String welcome(){
        return "successfully login";


    }

    @RequestMapping(value = "/welcome")
    public String welcome1(){
        return "successfully login welcome";
    }

    @RequestMapping(value = "/student")
    public String welcome2(){
        return "successfully login student";
    }
}
