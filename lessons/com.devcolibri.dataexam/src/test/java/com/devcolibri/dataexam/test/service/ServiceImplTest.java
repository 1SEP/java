package com.devcolibri.dataexam.test.service;

import com.devcolibri.dataexam.entity.Bank;
import com.devcolibri.dataexam.entity.Client;
import com.devcolibri.dataexam.repository.ClientRepository;
import com.devcolibri.dataexam.service.ClientService;
import com.devcolibri.dataexam.test.config.TestDataBaseConfig;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 * 27.10.15
 * ServiceImplTest
 *
 * @author Ildar Almakayev (First Software Engineering Platform)
 * @version v1.0
 */
@DirtiesContext
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestDataBaseConfig.class)
@WebAppConfiguration
public class ServiceImplTest {

    @Autowired
    private EntityManagerFactory emf;

    private EntityManager em;

    @Autowired
    private ClientService clientService;

    @Before
    public void setUp() throws Exception {
        em = emf.createEntityManager();
    }

    @Test
    public void testAddClient() throws Exception {
        Bank bank = new Bank("Alfa Bank");
        Client client = new Client("Ildar","Almakayev", "121","address","email", bank);
        Client persistedClient = clientService.addClient(client);
        System.out.println(persistedClient);
    }

    @Test
    public void testGetClient() throws Exception {
        Client client = clientService.getClient(1);
        System.out.println(client.getBank());
    }
}
