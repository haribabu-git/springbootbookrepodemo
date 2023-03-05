package com.example.demo.dao;

import com.example.demo.entity.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface  EmployeeRepository extends JpaRepository<Employee, Integer> {
}
