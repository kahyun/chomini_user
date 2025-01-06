package com.example.user.service;

import com.example.user.dao.UserDAO;
import com.example.user.dao.UserDAOImpl;
import com.example.user.dto.UserRequestDTO;
import com.example.user.dto.UserResponseDTO;
import com.example.user.entity.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {
    private final UserDAO userDAO;
    private final ModelMapper modelMapper;
    @Override
    public void write(UserRequestDTO user) {
        User entity =  modelMapper.map(user, User.class);
        System.out.println(entity);
        userDAO.write(entity);
    }

    @Override
    public UserResponseDTO login(String username, String password) {
        return null;
    }

    @Override
    public Optional<User> findById(Long id) {
        return userDAO.findById(id);
    }
    @Override
    public void delete(Long id) {
        userDAO.delete(id);
    }
    @Override
    public List<User> findAll() {
        return userDAO.findAll();
    }
}
