package com.javaMentor.CRUD.repository;

import com.javaMentor.CRUD.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(value = "select u from User u where u.email = ?1")
    User findByLogin(String login);
}
