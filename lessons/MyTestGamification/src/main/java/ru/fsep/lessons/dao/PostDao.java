package ru.fsep.lessons.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.fsep.lessons.models.Post;

public interface PostDao extends JpaRepository<Post, Integer> {
}
