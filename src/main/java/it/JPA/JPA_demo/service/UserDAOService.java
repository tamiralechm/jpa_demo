package it.JPA.JPA_demo.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import it.JPA.JPA_demo.entities.User;

//this helps us to store things to the DB,its a repo so we use anotation @repositor
@Repository
@Transactional
public class UserDAOService {
    
    //save users and retrive user entity using the entitymgr
    @PersistenceContext
    private EntityManager entityManager;
    //create=insert method, 
    public long insert(User user) {
        entityManager.persist(user);
        return user.getId();
    }
    
    

}
