package com.crud.dropwiz.user.service;

import com.crud.dropwiz.user.dao.service.UserDAO;
import com.crud.dropwiz.user.model.User;

import java.util.Collection;

public class UserServiceImpl implements UserService
{
    private UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO)
    {
        this.userDAO = userDAO;
    }

    @Override
    public User insert(User user)
    {
        return userDAO.insertUser(user);
    }

    @Override
    public User findById(int id)
    {
        return userDAO.findById(id);
    }

    @Override
    public Collection<User> findByName(String name)
    {
        return userDAO.findByName(name);
    }

    @Override
    public Collection<User> findAll()
    {
        return userDAO.findAll();
    }

    @Override
    public User update(User user)
    {
        return userDAO.updateUser(user);
    }

    @Override
    public User delete(long id)
    {
        return userDAO.deleteUser(id);
    }
}
