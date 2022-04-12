package com.dojoarquitectura.controllers;

import com.dojoarquitectura.models.BookModel;
import com.dojoarquitectura.services.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
public class BookController {
    
    @Autowired
    private BookService service;

    @PostMapping
    public BookModel createBook(@RequestBody BookModel book) {
        return service.createBook(book);
    }

}
