package ru.fsep.lessons.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.fsep.lessons.models.Book;
import ru.fsep.lessons.repository.BookRepository;

import java.util.List;

@Service
@Transactional
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book getBook(int id) {
        return bookRepository.findOne(id);
    }

    public Book update(Book book) {
        Book result = bookRepository.saveAndFlush(book);
        return result;
    }

    public void delete(int id) {
        bookRepository.delete(id);
    }

    public Book save(Book book) {
        Book result = bookRepository.saveAndFlush(book);
        return result;
    }

    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    @Transactional(readOnly = true)
    public List<Book> findByNameIgnoreCase(String name) {
        return bookRepository.findByNameIgnoreCase(name);
    }
}
