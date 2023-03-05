package com.example.springbooth2.config;


import com.example.springbooth2.model.*;
import org.springframework.batch.item.*;

public class EmployeeItemProcessor implements ItemProcessor<Employee,Employee> {
    @Override
    public Employee process(Employee employee) throws Exception {
        return employee;
    }


}
