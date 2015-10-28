package ru.fsep.lessons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
import ru.fsep.lessons.models.Book;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer>{
    @Transactional(readOnly = true)
    List<Book> findByNameIgnoreCase(String name);
}
