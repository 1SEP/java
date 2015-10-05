package com.devcolibri.dataexam.jpa.service;

import com.devcolibri.dataexam.jpa.entity.Book;

import java.util.List;

public interface BookService {
    Book add(Book book);
    Book getBook(int id);
    Book update(Book book);
    void delete(int id);
    List<Book> getAllBooks();
}
