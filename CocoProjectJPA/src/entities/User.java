package entities;

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
@Table (name = "Users")
public class User 
{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column (name = "nameUser")
    private String name;
    
    @Column (name = "passUser")
    private String pass;
    
    @Column (name = "imgUser")
    private String img;
    
    @Column (name = "statusUser")
    private int status;
    
    @ManyToOne (fetch = FetchType.LAZY) 
    @JoinColumn (name = "idUserType")
    private UserType userType;
    
    public User()
    {}

    public User(String name, String pass, String img, int status, UserType userType) 
    {
        this.name = name;
        this.pass = pass;
        this.img = img;
        this.status = status;
        this.userType = userType;
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

    public String getPass() 
    {
        return pass;
    }

    public void setPass(String pass) 
    {
        this.pass = pass;
    }

    public String getImg() 
    {
        return img;
    }

    public void setImg(String img) 
    {
        this.img = img;
    }

    public int getStatus() 
    {
        return status;
    }

    public void setStatus(int status) 
    {
        this.status = status;
    }

    public UserType getUserType() 
    {
        return userType;
    }

    public void setUserType(UserType userType) 
    {
        this.userType = userType;
    }
}
