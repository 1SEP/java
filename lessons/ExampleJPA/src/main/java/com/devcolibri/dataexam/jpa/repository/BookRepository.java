package com.devcolibri.dataexam.jpa.repository;

import com.devcolibri.dataexam.jpa.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
