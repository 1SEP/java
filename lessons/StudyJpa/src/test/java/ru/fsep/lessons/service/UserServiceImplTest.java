package ru.fsep.lessons.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ru.fsep.lessons.config.DataConfig;
import ru.fsep.lessons.models.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DataConfig.class)
public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testGetUser() throws Exception {
        User result = userService.getUser(1);
        System.out.println(result);
    }

    @Test
    public void testSave() throws Exception {
    }

    @Test
    public void testUpdate() throws Exception {
    }

    @Test
    public void testDelete() throws Exception {
    }

    @Test
    public void testGetAll() throws Exception {
    }
}