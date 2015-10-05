package com.devcolibri.dataexam.jpa.service.impl;

import com.devcolibri.dataexam.jpa.config.DataConfig;
import com.devcolibri.dataexam.jpa.entity.entities.Bank;
import com.devcolibri.dataexam.jpa.service.BankService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

@DirtiesContext
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DataConfig.class)
public class BankServiceJpaImplTest {

    @Resource
    private EntityManagerFactory emf;

    protected EntityManager em;

    @Resource
    private BankService bankService;

    @Before
    public void setUp() throws Exception {
        System.out.println(emf);
        em = emf.createEntityManager();
    }

    @Test
    public void testAddBank() throws Exception {
        String bankName = "new my Bank";
        Bank bank = new Bank(bankName);

        long start = System.currentTimeMillis();

        Bank fromDB = bankService.addBank(bank);

        long end = System.currentTimeMillis();
        System.out.println(end - start);

        System.out.println(fromDB);
    }

    @Test
    public void testGetAll() throws Exception {
        Bank bank1 = new Bank("bank1");
        bankService.addBank(bank1);

        Bank bank2 = new Bank("bank2");
        bankService.addBank(bank2);

        long startTime = System.currentTimeMillis();
        List<Bank> all = bankService.getAll();
        long endTime = System.currentTimeMillis();
        long result = endTime - startTime;
        System.out.println("Time of JPA = " + result);

        for (Bank bank : all) {
            System.out.println(bank);
        }
    }
}