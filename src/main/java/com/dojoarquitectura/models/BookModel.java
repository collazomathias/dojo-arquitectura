package com.dojoarquitectura.models;

import java.util.UUID;

public class BookModel {

    private String id = UUID.randomUUID().toString();
    private String title;
    private String author;

    public BookModel(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
}
