package com.crud.dropwiz.user.model;

import com.crud.dropwiz.user.util.UserDaoConstants;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = UserDaoConstants.TABLE_NAME)
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected  long id;

    @Column(name = "username")
    protected  String userName;

    @Column(name = "first_name")
    protected  String fName;

    @Column(name = "middle_name")
    protected  String mName;

    @Column(name = "last_name")
    protected  String lName;

    public User()
    {
        
    }

    public User(long id, String userName, String fName, String mName, String lName)
    {
        this.id = id;
        this.userName = userName;
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
    }

    @JsonProperty
    public  long getId()
    {
        return id;
    }

    @JsonProperty
    public  String getUserName()
    {
        return userName;
    }

    @JsonProperty
    public  String getfName()
    {
        return fName;
    }

    @JsonProperty
    public  String getmName()
    {
        return mName;
    }

    @JsonProperty
    public  String getlName()
    {
        return lName;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public void setfName(String fName)
    {
        this.fName = fName;
    }

    public void setmName(String mName)
    {
        this.mName = mName;
    }

    public void setlName(String lName)
    {
        this.lName = lName;
    }
}
