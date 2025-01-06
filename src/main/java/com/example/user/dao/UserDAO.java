package com.example.user.dao;

import com.example.user.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserDAO {
     void write(User user);
     Optional<User> findById(Long id) ;
     void delete(Long id) ;
     List<User> findAll() ;
     User login(String username, String password);
}
