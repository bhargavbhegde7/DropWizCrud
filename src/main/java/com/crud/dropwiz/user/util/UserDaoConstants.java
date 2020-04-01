package com.crud.dropwiz.user.util;

public class UserDaoConstants
{
    public static final String TABLE_NAME = "users";

    public static final String QUERY_PARAM_NAME = "name";
    public static final String QUERY_PARAM_USER_ID = "userId";

    public static final String FIND_ALL_USERS = "FIND_ALL_USERS";
    public static final String FIND_ALL_USERS_QUERY = "select u from User u";

    public static final String FIND_BY_USERNAME = "FIND_BY_USERNAME";
    public static final String FIND_BY_USERNAME_QUERY = "select u from User u where u.fName like :"+QUERY_PARAM_NAME+" or u.mName like :"+QUERY_PARAM_NAME+" or u.lName like :"+QUERY_PARAM_NAME+" or u.userName like :"+QUERY_PARAM_NAME+"";

    public static final String FIND_BY_USER_ID = "FIND_BY_USER_ID";
    public static final String FIND_BY_USER_ID_QUERY = "select u from User u where u.id = "+QUERY_PARAM_USER_ID;

    public static final String CREATE_USER = "CREATE_USER";
    public static final String CREATE_USER_QUERY = "";
}
