package com.example.pp312.dao;



import com.example.pp312.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    void add(User user);
    void remove(User user);
    void edit(User user);
    User getById(Long id);
}
