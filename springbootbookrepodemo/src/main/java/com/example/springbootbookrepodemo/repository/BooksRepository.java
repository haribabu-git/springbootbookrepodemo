package com.example.springbootbookrepodemo.repository;

import com.example.springbootbookrepodemo.model.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.*;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository extends JpaRepository<Books,Integer> {
}
