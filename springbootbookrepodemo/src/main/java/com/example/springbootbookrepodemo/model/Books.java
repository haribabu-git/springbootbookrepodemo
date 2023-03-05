package com.example.springbootbookrepodemo.model;

import javax.persistence.*;

@Entity
@Table
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookid;
    private String bookname;
    private int price;


    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



}
