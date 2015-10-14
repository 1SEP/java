package ru.fsep.lessons.service;

import ru.fsep.lessons.entities.Book;
import java.util.Set;

public interface BookService {

    Book getBook(int id);

    Book addBook(Book book);

    void deleteBook(int id);

    Set<Book> getAllBooks();
}
