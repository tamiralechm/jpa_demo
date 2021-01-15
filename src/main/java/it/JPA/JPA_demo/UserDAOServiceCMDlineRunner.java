package it.JPA.JPA_demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import it.JPA.JPA_demo.entities.User;
import it.JPA.JPA_demo.service.UserDAOService;

@Component
public class UserDAOServiceCMDlineRunner implements CommandLineRunner {
    
    private static final Logger log=LoggerFactory.getLogger(UserDAOServiceCMDlineRunner.class);
     
    //create the instance of userdaoservice and annotate
    @Autowired
    private UserDAOService userDAOs;

    @Override
    public void run(String... args) throws Exception {
        User user=new User("tamri","Admin");
       long insert= userDAOs.insert(user);
       log.info("user created "+ user);
        
        
    }

}
