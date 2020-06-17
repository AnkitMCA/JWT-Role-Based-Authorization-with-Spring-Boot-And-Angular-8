package com.example.angularspringcertifiacate.service;

import com.example.angularspringcertifiacate.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    User findByUsername(String username);

    List<User> findAllUsers();
}
