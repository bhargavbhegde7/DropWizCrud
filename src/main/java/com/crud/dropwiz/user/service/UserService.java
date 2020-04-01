package com.crud.dropwiz.user.service;

import com.crud.dropwiz.user.model.User;

import java.util.Collection;

public interface UserService
{
    User insert(User user);
    User findById(int id);
    Collection<User> findByName(String name);
    Collection<User> findAll();
    User update(User user);
    User delete(long id);
}
