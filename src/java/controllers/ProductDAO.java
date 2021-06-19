package controllers;

import entities.Product;
import java.util.List;

public class ProductDAO extends BaseController
{
    public ProductDAO()
    {
        super();
    }
    
    public Product getProduct(Long id)
    {
        return getEM().find(Product.class, id);
    }
    
    public List<Product> getProducts()
    {
        return getEM().createNativeQuery("SELECT * FROM Products p", Product.class).getResultList();
    }
    
    public void updateProduct(Product product)
    {
        getEM().getTransaction().begin();
        
        getEM().merge(product);
        getEM().persist(product);
        getEM().remove(product);
        
        getEM().getTransaction().commit();
        getEM().close();
    }
}
