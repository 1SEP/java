package ru.fsep.lessons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.fsep.lessons.entities.Book;

interface BookRepository extends JpaRepository<Book, Integer> {
}
