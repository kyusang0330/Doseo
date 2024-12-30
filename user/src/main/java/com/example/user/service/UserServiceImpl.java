package com.example.user.service;

import com.example.user.dao.UserDAOImpl;
import com.example.user.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserDAOImpl userDAO;
    @Override
    public void insert(User user) {
        userDAO.insert(user);
    }
    @Override
    public User findById(Long id) {
        return userDAO.findById(id);
    }
    @Override
    public void delete(Long id) {
        userDAO.delete(id);
    }
    @Override
    public void update(User user) {
        userDAO.update(user);
    }
    @Override
    public List<User> findAll() {
        return userDAO.findAll();
    }
}
