package ru.fsep.lessons.services;

import ru.fsep.lessons.models.Book;

import java.util.List;

/**
 * 21.11.15
 * BookService
 *
 * @author Ildar Almakayev (First Software Engineering Platform)
 * @version v1.0
 */
public interface BookService {
    Book findBook(int id);
    Book save(Book book);
    void update(Book book);
    List<Book> getAll();
    void delete(int id);

}
