package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table (name = "Records")
public class Record implements Serializable 
{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column (name = "idUser")
    private Long idUser;
    
    @Column (name = "nameProduct")
    private String nameProduct;
    
    @Column (name = "priceProduct")
    private int price;
    
    @Column (name = "qtyProduct")
    private int qtyProduct;
    
    @Column (name = "dateRecord")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateRecord;
    
    public Record()
    {}
    
    public Record(Long idUser, String nameProduct, int price, int qtyProduct, Date dateRecord) 
    {
        this.idUser = idUser;
        this.nameProduct = nameProduct;
        this.price = price;
        this.qtyProduct = qtyProduct;
        this.dateRecord = dateRecord;
    }

    public Long getId() 
    {
        return id;
    }

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getIdUser() 
    {
        return idUser;
    }

    public void setIdUser(Long idUser) 
    {
        this.idUser = idUser;
    }

    public String getNameProduct() 
    {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) 
    {
        this.nameProduct = nameProduct;
    }

    public int getPrice() 
    {
        return price;
    }

    public void setPrice(int price) 
    {
        this.price = price;
    }

    public int getQtyProduct() 
    {
        return qtyProduct;
    }

    public void setQtyProduct(int qtyProduct) 
    {
        this.qtyProduct = qtyProduct;
    }

    public Date getDateRecord() 
    {
        return dateRecord;
    }

    public void setDateRecord(Date dateRecord) 
    {
        this.dateRecord = dateRecord;
    }
}
