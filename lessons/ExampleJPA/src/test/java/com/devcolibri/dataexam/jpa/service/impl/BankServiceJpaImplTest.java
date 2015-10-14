package com.devcolibri.dataexam.jpa.service.impl;

import com.devcolibri.dataexam.jpa.config.DataConfig;
import com.devcolibri.dataexam.jpa.entity.entities.Bank;
import com.devcolibri.dataexam.jpa.service.BankService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DataConfig.class)
public class BankServiceJpaImplTest {

    @Autowired
    private EntityManagerFactory emf;

    protected EntityManager em;

    @Autowired
    private BankService bankService;

    @Before
    public void setUp() throws Exception {
        em = emf.createEntityManager();
    }

    @Test
    public void testAddBank() throws Exception {
        String bankName = "Deutche Bank";
        Bank bank = new Bank(bankName);

        long start = System.currentTimeMillis();
        Bank fromDB = bankService.addBank(bank);
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        System.out.println(fromDB);
    }

    @Test
    public void testGetAll() throws Exception {
        long startTime = System.currentTimeMillis();
        List<Bank> all = bankService.getAll();
        long endTime = System.currentTimeMillis();
        System.out.println("Time of JPA = " + (endTime - startTime));
        System.out.println("Size of collection = " + all.size());

        System.out.println(all);
    }

    @Test
    public void testGetByName() throws Exception {
        long start = System.currentTimeMillis();
        Bank result = bankService.getByName("SberBank");
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        System.out.println(result);
    }

    @Test
    public void testEdit() throws Exception {
        //TODO
    }
}