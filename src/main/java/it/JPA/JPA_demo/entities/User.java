package it.JPA.JPA_demo.entities;

 import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//mapping will be between table User AND this entity

@Entity
public class User {
   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)   //specify strategy,seq,table,identity or auto
    private long id;
   // @Column(name = "name") set table column name
    private String name;
    private String role;
    
    
    //lets define default constructor
    protected User() {
        
    }
    
//generate constructor using fields
    public User(String name, String role) {
        super();
        this.name = name;
        this.role = role;
    }
    
    //generate getters and setters,only getters here
    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getRole() {
        return role;
    }
    
    //generate toString
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", role=" + role + "]";
    }
    
     

}
