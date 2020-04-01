package com.crud.dropwiz;

import com.crud.dropwiz.config.AppConfig;
import com.crud.dropwiz.user.controller.UserCrudController;
import com.crud.dropwiz.user.dao.impl.UserDAOImpl;
import com.crud.dropwiz.user.model.User;
import com.crud.dropwiz.user.service.UserService;
import com.crud.dropwiz.user.service.UserServiceImpl;
import io.dropwizard.Application;
import io.dropwizard.db.PooledDataSourceFactory;
import io.dropwizard.hibernate.HibernateBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class MainWebApp extends Application<AppConfig>
{
    private final HibernateBundle<AppConfig> hibernateBundle = new HibernateBundle<AppConfig>(User.class)
    {
        @Override
        public PooledDataSourceFactory getDataSourceFactory(AppConfig appConfig)
        {
            return appConfig.getDataSourceFactory();
        }
    };

    @Override
    public String getName()
    {
        return "CRUD APP";
    }

    @Override
    public void initialize(Bootstrap<AppConfig> bootstrap)
    {
        bootstrap.addBundle(hibernateBundle);
    }

    @Override
    public void run(AppConfig configuration, Environment environment)
    {
        final UserService userService = new UserServiceImpl(new UserDAOImpl(hibernateBundle.getSessionFactory()));
        environment.jersey().register(new UserCrudController(userService));
    }

    public static void main(String[] args) throws Exception
    {
        new MainWebApp().run(args);
    }
}
