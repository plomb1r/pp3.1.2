package com.example.pp312.service;

import com.example.pp312.model.User;


import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void add(User user);
    void remove(User user);
    void edit(User user);
    User getById(Long id);
}
