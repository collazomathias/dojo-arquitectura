package com.dojoarquitectura.repositories;

import java.util.ArrayList;
import java.util.List;

import com.dojoarquitectura.models.BookModel;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    
    private List<BookModel> books = new ArrayList<>();

    public BookModel saveBook(BookModel book) {
        books.add(book);
        return book;
    }

}
