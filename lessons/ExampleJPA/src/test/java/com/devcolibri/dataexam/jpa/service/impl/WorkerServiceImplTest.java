package com.devcolibri.dataexam.jpa.service.impl;

import com.devcolibri.dataexam.jpa.config.DataConfig;
import com.devcolibri.dataexam.jpa.entity.entities.Bank;
import com.devcolibri.dataexam.jpa.entity.entities.Worker;
import com.devcolibri.dataexam.jpa.entity.enums.WorkerStatus;
import com.devcolibri.dataexam.jpa.service.WorkerService;
import org.junit.Assert;
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
public class WorkerServiceImplTest {

    @Resource
    private EntityManagerFactory emf;

    private EntityManager em;

    @Resource
    WorkerService workerService;

    @Before
    public void setUp() throws Exception {
        em = emf.createEntityManager();
    }

    @Test
    public void testAddWorker() throws Exception {
        Worker worker = new Worker("Ildar", "Almakayev", WorkerStatus.MANAGER, "dwq3", new Bank("Super bank"));
        workerService.addWorker(worker);

        Worker fromDB = workerService.getWorker(1);
        System.out.println(fromDB);

    }

    @Test
    public void testGetWorker() throws Exception {
        Worker worker = new Worker("", "", WorkerStatus.MANAGER, "", new Bank("Golden Bank"));
        workerService.addWorker(worker);
        Worker fromDB = workerService.getWorker(1);
        System.out.println(fromDB);
    }

    @Test
    public void testGetAllworkers() throws Exception {

    }

    @Test
    public void testDeleteWorker() throws Exception {
        Worker worker = new Worker("Ildar", "Almakayev", WorkerStatus.MANAGER, "dwq3", new Bank("Super bank"));
        workerService.addWorker(worker);
        workerService.deleteWorker(1);
        Worker fromDB = workerService.getWorker(1);
        Assert.assertNull("The worker must be a null! ", fromDB);

    }
}