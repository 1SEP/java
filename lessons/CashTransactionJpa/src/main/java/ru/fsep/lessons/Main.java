package ru.fsep.lessons;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class Main {

    @Resource
    EntityManagerFactory emf;

    @Resource
    EntityManager em;

    public static void main(String[] args) {

    }
}
