package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "UserTypes")
public class UserType 
{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column (name = "nameUserType")
    private String nameUserType;

    public UserType()
    {}
    
    public UserType(String nameUserType) 
    {
        this.nameUserType = nameUserType;
    }

    public Long getId() 
    {
        return id;
    }

    public void setId(Long id) 
    {
        this.id = id;
    }

    public String getNameUserType() 
    {
        return nameUserType;
    }

    public void setNameUserType(String nameUserType) 
    {
        this.nameUserType = nameUserType;
    }
}
