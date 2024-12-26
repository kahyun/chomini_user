package com.example.user.dao;

import com.example.user.entity.User;

import java.util.List;

public interface UserDAO {
    public void insert(User user);
    public User findById(Long id) ;
    public void delete(Long id) ;
    public void update(User user);
    public List<User> findAll() ;
}
