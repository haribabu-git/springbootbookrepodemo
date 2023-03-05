package com.example.springbootbookrepodemo.controller;


import com.example.springbootbookrepodemo.model.*;
import com.example.springbootbookrepodemo.service.*;
import net.sf.jasperreports.engine.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.io.*;
import java.util.*;

@RestController
public class BooksController {

    @Autowired
    BooksService booksService;

    @Autowired
    PostService postService;

    @GetMapping("/book")
    private List<Books> getAllBooks()
    {
        return booksService.getAllBooks();
    }

    @PostMapping(value = "/savebook")
    private int saveBook(@RequestBody Books books)
    {
        booksService.saveOrUpdate(books);
        return books.getBookid();
    }

    @GetMapping("/book/{format}")
    public String generateReport(@PathVariable String format) throws JRException, FileNotFoundException {
       return booksService.exportReport(format);
    }

    @GetMapping("/checkpost")
    private void savePost()
    {
        PostComment p = new PostComment();p.setComments("this is tough");

        PostComment p1 = new PostComment();p1.setComments("this is easy");

        Post post = new Post();
        post.setTitle("java");
        post.getList().add(p1);
        post.getList().add(p);
        p.setPost(post);p1.setPost(post);






        postService.saveorUpdate(post);


    }
}
