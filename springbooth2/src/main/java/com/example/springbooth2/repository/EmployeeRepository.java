package com.example.springbooth2.repository;

import com.example.springbooth2.model.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
