package com.example.demo;


import com.example.demo.dao.*;
import com.example.demo.entity.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;


    @RequestMapping("/save")
    public String saveEmployee(){
        Employee e = new Employee(1,"hari",10);
        employeeRepository.save(e);

        return "reccord saved successfully";
    }


}
