package com.photostore.service;

import com.photostore.dao.UserDAO;
import com.photostore.entity.Users;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class UsersService {
    private final UserDAO userDAO;

    public UsersService() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PhotoStoreWebsite");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        userDAO = new UserDAO(entityManager);
    }


    public List<Users> listUsers() {
        return userDAO.listAll();
    }
}
