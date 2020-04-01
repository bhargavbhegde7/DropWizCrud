/*
package com.crud.dropwiz;

import com.crud.dropwiz.user.controller.UserCrudController;
import com.crud.dropwiz.user.dao.impl.UserDAOImpl;
import com.crud.dropwiz.user.dao.service.UserDAO;
import com.crud.dropwiz.user.model.User;
import com.crud.dropwiz.user.service.UserServiceImpl;
import io.dropwizard.testing.junit.ResourceTestRule;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Test;
import org.mockito.Matchers;

import java.util.Collection;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UserCrudTest
{
    private static final UserDAO userDAO = mock(UserDAOImpl.class);

    @ClassRule
    public static final ResourceTestRule resources = ResourceTestRule.builder().addResource(new UserCrudController(new UserServiceImpl(userDAO))).build();

    private final User user = new User(1, "hpotter", "harry", "james", "potter");

    @Before
    public void setup()
    {
        when(userDAO.findByName(Matchers.eq("hpotter"))).thenReturn((Collection<User>) user);
    }

    @Test
    public void testFindByName(){
       // Assertions.assertThat(resources.client().r)
    }

}
*/
