package com.javaMentor.CRUD.Service;

import com.javaMentor.CRUD.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    User getUser(int id);
    void updateUser(User user);
    void deleteUser(int id);
    List<User> getAllUsers();
    User findByLogin(String login);
}
