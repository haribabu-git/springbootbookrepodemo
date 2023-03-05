package com.example.springbootbookrepodemo.repository;


import com.example.springbootbookrepodemo.model.*;
import org.springframework.data.repository.*;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post,Integer> {
}
