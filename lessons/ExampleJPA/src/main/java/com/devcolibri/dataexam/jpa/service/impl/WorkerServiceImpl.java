package com.devcolibri.dataexam.jpa.service.impl;

import com.devcolibri.dataexam.jpa.entity.Worker;
import com.devcolibri.dataexam.jpa.repository.WorkerRepository;
import com.devcolibri.dataexam.jpa.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerServiceImpl implements WorkerService {

    @Autowired
    WorkerRepository workerRepository;

    @Override
    public Worker addWorker(Worker worker) {
        return workerRepository.saveAndFlush(worker);
    }

    @Override
    public Worker getWorker(long id) {
        return workerRepository.findOne(id);
    }

    @Override
    public List<Worker> getAllworkers() {
        return workerRepository.findAll();
    }

    @Override
    public void deleteWorker(long id) {
        workerRepository.delete(id);
    }
}
