package com.example.springbootbookrepodemo.model;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import java.util.*;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int postId;
    private String title;


    @OneToMany( mappedBy = "post",cascade=CascadeType.PERSIST,fetch = FetchType.EAGER)
    @JsonIgnoreProperties("post")
    private List<PostComment> list = new ArrayList<>();




    public List<PostComment> getList() {
        return list;
    }
    public void setList(List<PostComment> list) {
        this.list = list;
    }
    public int getPostId() {
        return postId;
    }
    public void setPostId(int postId) {
        this.postId = postId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Post( String title, List<PostComment> list) {
        super();

        this.title = title;
        this.list = list;
    }

    public Post() {};




}