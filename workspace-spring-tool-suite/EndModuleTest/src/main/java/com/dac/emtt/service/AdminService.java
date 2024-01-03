package com.dac.emtt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dac.emtt.modal.Admin;
import com.dac.emtt.modal.User;
import com.dac.emtt.repo.AdminRepository;
import com.dac.emtt.repo.UserRepository;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AdminRepository adminRepository;

    // Get all users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Get user by ID
    public User getUserById(int userId) {
        return userRepository.findById(userId).orElse(null);
    }

    // Add a new user
    public void addUser(User user) {
        userRepository.save(user);
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

    // Get admin by ID
    public Admin getAdminById(int adminId) {
        return adminRepository.findById(adminId).orElse(null);
    }

    // Update an existing admin
    public void updateAdmin(Admin admin, int adminId) {
        Admin existingAdmin = adminRepository.findById(adminId).orElse(null);
        if (existingAdmin != null) {
            existingAdmin.setUsername(admin.getUsername());
            existingAdmin.setEmail(admin.getEmail());
            existingAdmin.setPassword(admin.getPassword());
            adminRepository.save(existingAdmin);
        }
    }

    // Delete an admin
    public void deleteAdmin(int adminId) {
        adminRepository.deleteById(adminId);
    }

    // Get admin by username
    public Admin getAdminByUsername(String username) {
        return adminRepository.findByUsername(username);
    }
}
