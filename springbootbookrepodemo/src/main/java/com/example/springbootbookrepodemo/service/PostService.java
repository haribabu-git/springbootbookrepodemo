package com.example.springbootbookrepodemo.service;


import com.example.springbootbookrepodemo.model.*;
import com.example.springbootbookrepodemo.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Service
public class PostService {

    @Autowired
    public PostRepository postRepository;

    public void saveorUpdate(Post post){
        postRepository.save(post);
    }

}
