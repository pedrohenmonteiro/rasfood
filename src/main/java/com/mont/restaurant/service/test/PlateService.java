package com.mont.restaurant.service.test;

import com.mont.restaurant.dao.PlateDao;
import com.mont.restaurant.entity.Plate;
import com.mont.restaurant.util.JPAUtil;

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


        EntityManager entityManager = JPAUtil.getEntityManagerRasfood();
        PlateDao plateDao = new PlateDao(entityManager);
        entityManager.getTransaction().begin();
        plateDao.create(risotto);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
