package ru.fsep.lessons.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.fsep.lessons.models.Book;
import ru.fsep.lessons.repository.BookRepository;

import java.util.List;

/**
 * 21.11.15
 * BookServiceImpl
 *
 * @author Ildar Almakayev (First Software Engineering Platform)
 * @version v1.0
 */
@Service
@Transactional
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book findBook(int id) {
        return bookRepository.findOne(id);
    }

    public Book save(Book book) {
        return bookRepository.save(book);
    }

    public void update(Book book) {
        bookRepository.save(book);
    }

    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    public void delete(int id) {
        bookRepository.delete(id);
    }
}
