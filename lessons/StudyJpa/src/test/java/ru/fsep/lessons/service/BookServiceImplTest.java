package ru.fsep.lessons.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ru.fsep.lessons.config.DataConfig;
import ru.fsep.lessons.models.Auth;
import ru.fsep.lessons.models.Book;
import ru.fsep.lessons.models.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

/**
 * 16.10.15
 * BookServiceImplTest
 *
 * @author Ildar Almakayev (First Software Engineering Platform)
 * @version v1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DataConfig.class)
public class BookServiceImplTest {

    @Autowired
    private EntityManagerFactory emf;

    private EntityManager em;

    @Autowired
    private BookService bookService;

    @Autowired
    private UserService userService;

    @Before
    public void setUp() throws Exception {
        em = emf.createEntityManager();
    }

    @Test
    public void testSave() throws Exception {
        User user = new User("Ivan", new Auth("loginius", "passwordius"));
        User persistedUser = userService.save(user);
        System.out.println(persistedUser);

        Book book = new Book("Spring in action", persistedUser);
        Book persistedBook = bookService.save(book);
        persistedUser.getBooks().add(persistedBook);

    }

    @Test
    public void testGetBook() throws Exception {
        int id = 2;
        User user = userService.getUser(id);
        System.out.println(user);
    }

    @Test
    public void testFindByNameIgnoreCase() throws Exception {
        List<Book> result = bookService.findByNameIgnoreCase("spring in action");
        System.out.println(result.get(0).getUser());
    }

    @Test
    public void testGet() throws Exception {

    }

    @Test
    public void testGetWithDataJpa() throws Exception {
        Book book = bookService.getBook(2);
        System.out.println(book);
        System.out.println(book.getUser());
    }

    @Test
    public void testGetAll() throws Exception {
        List<User> userList = userService.getAll();
        System.out.println(userList);
    }
}