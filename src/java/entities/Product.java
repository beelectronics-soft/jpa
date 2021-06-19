package entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "Products")
public class Product implements Serializable 
{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column (name = "nameProduct")
    private String name;
    
    @Column (name = "stockProduct")
    private int stock;
    
    @Column (name = "imgProduct")
    private String img;
    
    @Column (name = "priceProduct")
    private int price;
    
    @ManyToOne (fetch = FetchType.LAZY) 
    @JoinColumn (name = "idCategory")
    private Category category;
    
    public Product()
    {}

    public Product(String name, int stock, String img, int price, Category category) 
    {
        this.name = name;
        this.stock = stock;
        this.img = img;
        this.price = price;
        this.category = category;
    }

    public Long getId() 
    {
        return id;
    }

    public void setId(Long id) 
    {
        this.id = id;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public int getStock() 
    {
        return stock;
    }

    public void setStock(int stock) 
    {
        this.stock = stock;
    }

    public String getImg() 
    {
        return img;
    }

    public void setImg(String img) 
    {
        this.img = img;
    }

    public int getPrice() 
    {
        return price;
    }

    public void setPrice(int price) 
    {
        this.price = price;
    }

    public Category getCategory() 
    {
        return category;
    }

    public void setCategory(Category category) 
    {
        this.category = category;
    }
}
