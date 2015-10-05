package com.devcolibri.dataexam.jpa.service.impl;

import com.devcolibri.dataexam.jpa.config.DataConfig;
import com.devcolibri.dataexam.jpa.entity.entities.Bank;
import com.devcolibri.dataexam.jpa.entity.entities.Client;
import com.devcolibri.dataexam.jpa.service.ClientService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

@DirtiesContext
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DataConfig.class)
public class ClientServiceImplTest {

    @Resource
    EntityManagerFactory emf;

    EntityManager em;

    @Resource
    ClientService clientService;

    @Before
    public void setUp() throws Exception {
        em = emf.createEntityManager();
    }

    @Test
    public void testAddClient() throws Exception {
        Bank bank = new Bank("SberBank");
        Client client = new Client("Ildar", "Almakayev", "Kazan", "phone number", "email", bank);

        long start = System.currentTimeMillis();
        clientService.addClient(client);
        long end = System.currentTimeMillis();

        System.out.println(end - start);
        Client fromDB = clientService.getClient(client.getId() + 1);
        System.out.println(fromDB);
    }

    @Test
    public void testGetClient() throws Exception {

    }

    @Test
    public void testDeleteClient() throws Exception {

    }

    @Test
    public void testGetAllClients() throws Exception {

    }
}