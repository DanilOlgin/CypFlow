package com.photostore.dao;

import com.photostore.entity.Users;

import javax.persistence.EntityManager;
import java.util.List;

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
