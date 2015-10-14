package ru.fsep.lessons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.fsep.lessons.entities.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
