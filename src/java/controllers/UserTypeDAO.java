package controllers;

import entities.UserType;
import java.util.List;

public class UserTypeDAO extends BaseController
{
    public UserTypeDAO()
    {
        super();
    }
    
    public UserType getUserType(Long id)
    {
        return getEM().find(UserType.class, id);
    }
    
    public List<UserType> getUserTypes()
    {
        return getEM().createNativeQuery("SELECT * FROM UserTypes u", UserType.class).getResultList();
    }
}
