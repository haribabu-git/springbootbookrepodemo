package com.example.springbootbookrepodemo.model;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;

@Entity
public class PostComment {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int postCommentId;
    private String comments;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "postId",referencedColumnName = "postId")
    @JsonIgnoreProperties("list")
    private Post post;


    public Post getPost() {
        return post;
    }
    public void setPost(Post post) {
        this.post = post;
    }
    public int getPostCommentId() {
        return postCommentId;
    }
    public void setPostCommentId(int postCommentId) {
        this.postCommentId = postCommentId;
    }
    public String getComments() {
        return comments;
    }
    public void setComments(String comments) {
        this.comments = comments;
    }


}
