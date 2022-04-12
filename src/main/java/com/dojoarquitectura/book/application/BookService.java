package com.dojoarquitectura.book.application;

import com.dojoarquitectura.book.domain.BookModel;
import com.dojoarquitectura.book.infrastructure.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepository repository;
 
    public BookModel createBook(BookModel book) {
        return repository.saveBook(book);
    }

}
