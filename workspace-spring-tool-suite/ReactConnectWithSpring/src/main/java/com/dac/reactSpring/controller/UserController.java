package com.dac.reactSpring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dac.reactSpring.modal.User;
import com.dac.reactSpring.repository.UserRepository;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/api/users")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/api/users/{id}")
    public User getUserById(@PathVariable Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @PostMapping("/api/users")
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @PutMapping("/api/users/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        user.setId(id);
        return userRepository.save(user);
    }

    @DeleteMapping("/api/users/{id}")
    public void deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);
    }
}