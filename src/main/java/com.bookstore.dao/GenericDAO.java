package com.bookstore.dao;

import com.bookstore.entity.Users;

import java.util.List;

public interface GenericDAO<T> {
    public Users create(T t);
    public T update(T t);
    public  T get(Object t);
    public void delete(Object t);
    public List<T> listAll();
    public long count();
}
