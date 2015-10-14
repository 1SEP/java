package com.devcolibri.dataexam.jdbc.dao;

import com.devcolibri.dataexam.jdbc.BankDaoImpl;
import com.devcolibri.dataexam.jpa.entity.entities.Bank;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class BankDaoImplTest {

    ApplicationContext context;

    BankDaoImpl bankDao;

    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("JdbcConfig.xml");
        bankDao = (BankDaoImpl) context.getBean("bankDao");
    }

    @Test
    public void testGetById() throws Exception {
        long start = System.currentTimeMillis();

        Bank result = bankDao.getBank(1);

        long end = System.currentTimeMillis();
        long time = end - start;

        System.out.println("Time of JDBC = " +   time);

        System.out.println(result);
    }

    @Test
    public void testAddBank() throws Exception {
        Bank bank = new Bank("Deutsche Bank");

//        System.out.println(bank.getId());
        long start = System.currentTimeMillis();
        bankDao.addBank(bank);
        long end = System.currentTimeMillis();

        long time = end - start;

        System.out.println(time);

        Bank fromDB = bankDao.getBank(2);
        System.out.println(fromDB);
    }

    @Test
    public void testGetAll() throws Exception {
        List<Bank> result = bankDao.getAll();
        System.out.println("Size of collection = " + result.size());
    }

}
