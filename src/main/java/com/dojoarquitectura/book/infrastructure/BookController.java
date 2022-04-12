package com.dojoarquitectura.book.infrastructure;

import com.dojoarquitectura.book.application.BookService;
import com.dojoarquitectura.book.domain.BookModel;

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
