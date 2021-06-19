package controllers;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BaseController 
{
    private final EntityManagerFactory emf;
    private final EntityManager em;
    
    public BaseController()
    {
        emf = Persistence.createEntityManagerFactory("BeelectronicsJPAPU");
        em = emf.createEntityManager();
    }
    
    public EntityManager getEM()
    {
        return em;
    }
}


