package com.mont.restaurant.service.test;

import com.mont.restaurant.entity.Plate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;

public class PlateService {
    public static void main(String[] args) {
        Plate risotto = new Plate();
        risotto.setName("Risotto");
        risotto.setDescription("Risotto with mushrooms");
        risotto.setAvailable(true);
        risotto.setPrice(BigDecimal.valueOf(15.0));

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("rasfood");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(risotto);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
