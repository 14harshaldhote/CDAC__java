package com.dac.security.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dac.security.model.User;
import com.dac.security.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    public User getUser(String name) {
        return userRepository.findByUsername(name);
    }

    public User addUser(User user) {
        User savedUser = userRepository.save(user);
        return savedUser;
    }

}
