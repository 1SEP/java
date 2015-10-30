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
        //Create entity user
        User user = new User("Ildar", new Auth("login", "password"));

        //Add first book into collection
        Book book = new Book("Spring in action");
        Book persistedBook = bookService.save(book);
        user.getBooks().add(persistedBook);

        //Add other book into collection
        book = new Book("Effective Java");
        Book persistedBook2 = bookService.save(book);
        user.getBooks().add(persistedBook2);

        //Persist user to DB
        userService.save(user);

    }

    @Test
    public void testGetBook() throws Exception {
        int id = 1;
        User user = userService.getUser(id);
        System.out.println(user);
        System.out.println("----------------------");
    }

    @Test
    public void testFindByNameIgnoreCase() throws Exception {
    }

    @Test
    public void testGet() throws Exception {

    }

    @Test
    public void testGetWithDataJpa() throws Exception {

    }

    @Test
    public void testGetAll() throws Exception {

    }
}