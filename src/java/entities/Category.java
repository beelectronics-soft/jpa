package entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * Relaciones bidireccionales / unidireccionales
 * 1 -> N
 * 
 * del 1: la relacion se ve como una lista que compone a la clase
 * del N: la relacion se ve como un objeto que compone a la clase
 * 
 * @author David
 */

@Entity
@Table (name = "categories")
public class Category implements Serializable 
{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column (name="nameCategory")
    private String name;
    
    public Category()
    {}

    public Category(String name) 
    {
        this.name = name;
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
}
