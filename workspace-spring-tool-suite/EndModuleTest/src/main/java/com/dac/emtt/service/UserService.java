package com.dac.emtt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dac.emtt.modal.User;
import com.dac.emtt.repo.UserRepository;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Authenticate user by email and password
    public Optional<User> authenticate(String email, String password) {
        return userRepository.findByEmailAndPassword(email, password);
    }

    // Get user by ID
    public User getUserById(int userId) {
        return userRepository.findById(userId).orElse(null);
    }

    // Update an existing user
    public void updateUser(User user, int userId) {
        User existingUser = userRepository.findById(userId).orElse(null);
        if (existingUser != null) {
            existingUser.setUsername(user.getUsername());
            existingUser.setEmail(user.getEmail());
            existingUser.setPassword(user.getPassword());
            userRepository.save(existingUser);
        }
    }

    // Delete a user
    public void deleteUser(int userId) {
        userRepository.deleteById(userId);
    }
}
