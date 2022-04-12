package com.dojoarquitectura.book.infrastructure;

import java.util.ArrayList;
import java.util.List;

import com.dojoarquitectura.book.domain.BookModel;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    
    private List<BookModel> books = new ArrayList<>();

    public BookModel saveBook(BookModel book) {
        books.add(book);
        return book;
    }

}
