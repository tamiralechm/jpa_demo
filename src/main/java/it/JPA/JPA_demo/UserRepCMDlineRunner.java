package it.JPA.JPA_demo;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import it.JPA.JPA_demo.entities.User;
import it.JPA.JPA_demo.service.UserRepository;

@Component
public class UserRepCMDlineRunner implements CommandLineRunner {
    
    
    private static final Logger log=LoggerFactory.getLogger(UserRepository.class);
    
    @Autowired
    private UserRepository userRepo;

    @Override
    public void run(String... args) throws Exception {
      User user=new User("coco","boss");
      userRepo.save(user);
      log.info("new user added: "+user);
      
      Optional<User>userwithIDOne= userRepo.findById(1L);
      log.info("user fetched: "+userwithIDOne);
      
      List<User> users=userRepo.findAll();
      log.info("all users fetched: "+ users);
      
      
      userRepo.deleteById(1L);
      log.info(" users with id 1 is deleted,remaining user record is : "+ user);

      
      
    }
    
    

}
