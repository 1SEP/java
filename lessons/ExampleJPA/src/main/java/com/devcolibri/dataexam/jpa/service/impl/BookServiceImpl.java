package com.devcolibri.dataexam.jpa.service.impl;

import com.devcolibri.dataexam.jpa.entity.Book;
import com.devcolibri.dataexam.jpa.repository.BookRepository;
import com.devcolibri.dataexam.jpa.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Override
    public Book add(Book book) {
        return bookRepository.saveAndFlush(book);
    }

    @Override
    public Book getBook(int id) {
        return bookRepository.findOne(id);
    }

    @Override
    public Book update(Book book) {
        return bookRepository.saveAndFlush(book);
    }

    @Override
    public void delete(int id) {
        bookRepository.delete(id);
    }

    @Override
    public List<Book> getAllBooks() {
        List<Book> result = bookRepository.findAll();
        return result;
    }
}
