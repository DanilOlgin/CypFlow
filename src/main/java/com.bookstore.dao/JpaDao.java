package com.bookstore.dao;

import javax.persistence.EntityManager;

public class JpaDao<T> {
    protected EntityManager entityManager;

    public JpaDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public T create(T t) {
        entityManager.getTransaction().begin();
        entityManager.persist(t);
        entityManager.flush();
        entityManager.refresh(t);

        entityManager.getTransaction().commit();
        return t;
    }
}
