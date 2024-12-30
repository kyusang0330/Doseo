package com.example.user.dao;

import com.example.user.entity.User;

import java.util.List;

public interface UserDAO {
    void insert(User user);
    User findById(Long id) ;
    void delete(Long id) ;
    void update(User user);
    List<User> findAll() ;
}
