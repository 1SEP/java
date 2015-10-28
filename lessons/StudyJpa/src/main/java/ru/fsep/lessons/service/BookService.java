package ru.fsep.lessons.service;

import ru.fsep.lessons.models.Book;

import java.util.List;

public interface BookService {
    Book getBook(int id);
    Book update(Book book);
    void delete(int id);
    Book save(Book book);
    List<Book> findByNameIgnoreCase(String name);
    List<Book> getAll();
}
