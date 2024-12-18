package com.example.user.dao;

import com.example.user.entity.User;
import com.example.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserDAO {
    private final UserRepository userRepository;

    public void insert(User user) {
        userRepository.save(user);
    }

    public User findById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Rent not found"));
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    public void update(User user) {
        userRepository.save(user);
    }
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
