package ru.fsep.lessons.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import ru.fsep.lessons.Config;
import ru.fsep.lessons.models.Book;
import ru.fsep.lessons.models.User;

import java.util.List;

/**
 * 10.11.15
 * UserRepositoryTest
 *
 * @author Ildar Almakayev (First Software Engineering Platform)
 * @version v1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Config.class)
@Transactional
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BookRepository bookRepository;

    @Test
    public void testSave() throws Exception {
        User user = new User();
        user.setName("Ildar");
        Book book = new Book("Effective Java", user);
        bookRepository.save(book);

    }


    @Test
    public void testGetAll() throws Exception {
        List<User> all = userRepository.findAll();
        System.out.println(all);
    }

    @Test
    public void testGetUserAndBook() throws Exception {

    }

    @Test
    public void testDelete() throws Exception {

    }
}
