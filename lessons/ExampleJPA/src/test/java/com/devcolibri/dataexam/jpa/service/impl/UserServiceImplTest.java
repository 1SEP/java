package com.devcolibri.dataexam.jpa.service.impl;

import com.devcolibri.dataexam.jpa.config.DataConfig;
import com.devcolibri.dataexam.jpa.entity.Book;
import com.devcolibri.dataexam.jpa.entity.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import java.util.ArrayList;

import static org.junit.Assert.*;

@DirtiesContext
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DataConfig.class)
public class UserServiceImplTest {

    @Autowired
    private EntityManagerFactory emf;

    private EntityManager em;

    @Autowired
    private UserServiceImpl userService;


    @Before
    public void setUp() throws Exception {
        em = emf.createEntityManager();
    }

    @Test
    public void testAdd() throws Exception {
        User user = new User();
        user.setFirstName("Ildar");
        user.setLastName("Almakayev");
        user.setBooks(new ArrayList<Book>());
        userService.add(user);

        User fromDB = userService.getUser(1);
        System.out.println(fromDB);
    }

    @Test
    public void testGetUser() throws Exception {

    }

    @Test
    public void testUpdate() throws Exception {

    }

    @Test
    public void testDelete() throws Exception {

    }

    @Test
    public void testGetAllUsers() throws Exception {

    }
}