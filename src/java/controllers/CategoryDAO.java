package controllers;

import entities.Category;
import java.util.List;

public class CategoryDAO extends BaseController
{
    public CategoryDAO()
    {
        super();
    }
    
    public Category getCategory(Long id)
    {
        return getEM().find(Category.class, id);
    }
    
    public List<Category> getCategories()
    {
        return getEM().createNativeQuery("SELECT * FROM Categories c", Category.class).getResultList();
    }
}
