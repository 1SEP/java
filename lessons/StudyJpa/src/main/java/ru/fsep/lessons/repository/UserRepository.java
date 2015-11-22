package ru.fsep.lessons.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.fsep.lessons.models.Book;
import ru.fsep.lessons.models.User;

import java.util.List;

public interface UserRepository extends BaseRepository<User, Integer> {
    @Query("SELECT b FROM Book b WHERE b.user.id = :userId")
    List<Book> getAllBooksByUserId(@Param("userId")int userId);
}
