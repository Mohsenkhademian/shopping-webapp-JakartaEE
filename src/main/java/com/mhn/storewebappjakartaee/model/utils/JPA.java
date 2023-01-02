package com.mhn.storewebappjakartaee.model.utils;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPA {
    private static JPA jpa = new JPA();
    private EntityManagerFactory factory = Persistence.createEntityManagerFactory("mft");

    private JPA(){}

    public static JPA getJpa() {
        return jpa;
    }

    public EntityManager getEntityManager(){
        return factory.createEntityManager();
    }
}