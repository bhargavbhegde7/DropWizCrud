package com.crud.dropwiz.user.dao.impl;

import com.crud.dropwiz.user.dao.service.UserDAO;
import com.crud.dropwiz.user.model.User;
import io.dropwizard.hibernate.AbstractDAO;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Collection;

public class UserDAOImpl extends AbstractDAO<User> implements UserDAO
{
    public UserDAOImpl(SessionFactory sessionFactory)
    {
        super(sessionFactory);
    }

    @Override
    public Collection<User> findAll()
    {
        return currentSession().createCriteria(User.class).list();
    }

    @Override
    public User findById(long id)
    {
        return get(id);
    }

    @Override
    public Collection<User> findByName(String name)
    {
        Query query = currentSession().createQuery("select u from User u where u.fName like :name or u.mName like :name or u.lName like :name or u.userName like :name");
        query.setParameter("name", name);

        return query.list();
    }

    @Override
    public User insertUser(User user)
    {
        return persist(user);
    }

    @Override
    public User updateUser(User user)
    {
        Session session = currentSession();

        User u = (User) session.load(User.class, user.getId());

        u.setId(user.getId());
        u.setUserName(user.getUserName());
        u.setfName(user.getfName());
        u.setmName(user.getmName());
        u.setlName(user.getlName());

        session.update(u);

        return u;
    }

    @Override
    public User deleteUser(long id)
    {
        Session sess = currentSession();
        User u = (User) sess.load(User.class, id);
        sess.delete(u);

        return u;
    }
}
