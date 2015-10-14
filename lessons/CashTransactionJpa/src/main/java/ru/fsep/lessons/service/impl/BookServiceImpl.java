package ru.fsep.lessons.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.fsep.lessons.entities.Book;
import ru.fsep.lessons.repository.BookRepository;
import ru.fsep.lessons.service.BookService;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book getBook(int id) {
        return bookRepository.findOne(id);
    }

    public Book addBook(Book book) {
        return bookRepository.saveAndFlush(book);
    }

    public void deleteBook(int id) {
        bookRepository.delete(id);
    }

    public Set<Book> getAllBooks() {
        List<Book> all = bookRepository.findAll();
        return new HashSet<Book>(all);
    }
}
