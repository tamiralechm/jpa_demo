package it.JPA.JPA_demo.service;

import org.springframework.data.jpa.repository.JpaRepository;

import it.JPA.JPA_demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
