package com.example.user.service;

import com.example.user.dto.UserRequestDTO;
import com.example.user.dto.UserResponseDTO;
import com.example.user.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
     void write(UserRequestDTO user);
     UserResponseDTO login(String username, String password);
     Optional<User> findById(Long id) ;
     void delete(Long id) ;
     List<User> findAll() ;
}
