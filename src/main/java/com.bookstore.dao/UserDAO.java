package com.bookstore.dao;

import com.bookstore.entity.Users;

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
    public Users get(Object t) {
        return null;
    }

    @Override
    public void delete(Object t) {

    }

    @Override
    public List<Users> listAll() {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }
}
