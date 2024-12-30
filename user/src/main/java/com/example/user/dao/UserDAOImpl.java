package com.example.user.dao;

import com.example.user.entity.User;
import com.example.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@RequiredArgsConstructor
public class UserDAOImpl implements UserDAO {
    private final UserRepository userRepository;
    @Override
    public void insert(User user) {
        userRepository.save(user);
    }
    @Override
    public User findById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Rent not found"));
    }
    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }
    @Override
    public void update(User user) {
        userRepository.save(user);
    }
    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
