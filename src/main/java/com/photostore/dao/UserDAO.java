package com.photostore.dao;

import com.photostore.entity.Users;

import javax.persistence.EntityManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDAO extends JpaDao<Users> implements GenericDAO<Users>{

    public UserDAO(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Users create(Users entity) {
        return super.create(entity);
    }

    @Override
    public Users update(Users users) {
        return super.update(users);
    }

    @Override
    public Users get(Object userId) {
        return super.find(Users.class, userId);
    }

    public Users findByEmail(String email) {
        List<Users> usersList = super.findWithNamedQuery("Users.findByEmail", "email", email);

        if (usersList != null && usersList.size() > 0) {
            return usersList.get(0);
        }
        return null;
    }


    public boolean checkLogin(String email, String password) {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("email", email);
        parameters.put("password", password);

        List<Users> usersList = super.findWithNamedQuery("Users.checkLogin", parameters);
        return usersList.size() == 1;
    }

    @Override
    public void delete(Object t) {
        super.delete(Users.class, t);
    }

    @Override
    public List<Users> listAll() {
        return super.findWithNamedQuery("Users.findAll");
    }

    @Override
    public long count() {
        return (long) super.countWithNamedQuery("Users.countAll");
    }
}
