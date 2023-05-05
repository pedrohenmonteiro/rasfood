package com.mont.restaurant.dao;

import com.mont.restaurant.entity.Plate;

import javax.persistence.EntityManager;

public class PlateDao {

    private EntityManager entityManager;

    public PlateDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void create (final Plate plate) {
        this.entityManager.persist(plate);
    }

   public Plate findById(final Long id) {
        return this.entityManager.find(Plate.class, id);
   }

   public void update(final Plate plate) {
        this.entityManager.merge(plate);
   }

   public void delete(final Plate plate) {
        this.entityManager.remove(plate);
   }
}
