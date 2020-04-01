package com.crud.dropwiz.user.controller;

import com.crud.dropwiz.user.model.User;
import com.crud.dropwiz.user.service.UserService;
import io.dropwizard.hibernate.UnitOfWork;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Collection;
import java.util.List;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
public class UserCrudController
{
    /**
     * The DAO object to manipulate employees.
     */
    private UserService userService;

    /**
     * Constructor.
     *
     * @param userService DAO object to manipulate employees.
     */
    public UserCrudController(UserService userService)
    {
        this.userService = userService;
    }

    @GET
    @Path("/findByName/{name}")
    @UnitOfWork
    public Collection<User> findByName(@PathParam("name") String name)
    {
        return userService.findByName(name);
    }

    @GET
    @UnitOfWork
    public List<User> findAll() {
        return (List<User>) userService.findAll();
    }

    @GET
    @Path("/findById/{id}")
    @UnitOfWork
    public User findById(@PathParam("id") int id) {
        return userService.findById(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @UnitOfWork
    public User create(User user) {
        return userService.insert(user);
    }

    @DELETE
    @Path("/{id}")
    @UnitOfWork
    public User create(@PathParam("id") long id) {
        return userService.delete(id);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @UnitOfWork
    public User update(User user) {
        return userService.update(user);
    }
}
