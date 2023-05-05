package com.mont.restaurant.dao;

import com.mont.restaurant.entity.Plate;

import javax.persistence.EntityManager;

public class PlateDao {

    private EntityManager entityManager;

    public PlateDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void create (Plate plate) {
        this.entityManager.persist(plate);
        System.out.println("Plate created successfully: " + plate);
    }
}
