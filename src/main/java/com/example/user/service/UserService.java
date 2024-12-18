package com.example.user.service;

import com.example.user.dao.UserDAO;
import com.example.user.entity.User;
import com.example.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserDAO userDAO;
    public void insert(User user) {
        userDAO.insert(user);
    }

    public User findById(Long id) {
        return userDAO.findById(id);
    }

    public void delete(Long id) {
        userDAO.delete(id);
    }

    public void update(User user) {
        userDAO.update(user);
    }

    public List<User> findAll() {
        return userDAO.findAll();
    }
}
