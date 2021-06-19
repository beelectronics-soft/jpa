package controllers;

import entities.User;
import java.util.List;

public class UserDAO extends BaseController
{
    public UserDAO()
    {
        super();
    }
    
    public List<User> getUsers()
    {
        return getEM().createNativeQuery("SELECT * FROM Users u", User.class).getResultList();
    }
    
    public User getUser(Long id) 
    {
        return getEM().find(User.class, id);
    }
}
