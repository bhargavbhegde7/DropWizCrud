package com.crud.dropwiz.user.dao.service;

import com.crud.dropwiz.user.model.User;
import com.google.common.base.Optional;

import java.util.Collection;

public interface UserDAO
{
    Collection<User> findAll();
    User findById(long id);
    Collection<User> findByName(String name);
    User insertUser(User user);
    User updateUser(User user);
    User deleteUser(long id);
}
