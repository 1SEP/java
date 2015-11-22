package ru.fsep.lessons.services;

import org.junit.Assert;
import org.junit.Before;
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

import static org.junit.Assert.*;

/**
 * 21.11.15
 * UserServiceImplTest
 *
 * @author Ildar Almakayev (First Software Engineering Platform)
 * @version v1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Config.class)
public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Autowired
    private BookService bookService;

    private User user;
    private Book book;

    @Before
    public void setUp() throws Exception {
        user = new User("Saida");
        book = new Book("Remark", user);

    }

    @Test
    @Transactional(readOnly = true)
    public void testFindUser() throws Exception {
        Book book = bookService.findBook(1);
        System.out.println(book.getUser());
        assertNotNull(book);
    }

    @Test
    public void testSave() throws Exception {
        Book savedBook = bookService.save(book);
        System.out.println(savedBook);
        Assert.assertNotNull(savedBook);
        Assert.assertNotNull(user);
    }

    @Test
    public void testUpdate() throws Exception {
        User user = userService.findUser(1);
        user.setName("Ilka");
        User updatedUser = userService.save(user);

        System.out.println(updatedUser);
        assertNotNull(updatedUser);
    }

    @Test
    public void testDelete() throws Exception {

    }

    @Test
    @Transactional(readOnly = true)
    public void testGetAll() throws Exception {
        List<Book> bookList = bookService.getAll();
        System.out.println(bookList);

        for (Book book1 : bookList) {
            System.out.println(book1 + ", user =  " + book1.getUser());
        }
    }
}