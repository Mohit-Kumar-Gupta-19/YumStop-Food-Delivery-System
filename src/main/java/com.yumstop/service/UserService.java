package com.yumstop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yumstop.model.User;
import com.yumstop.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepo;

    // Register new user
    public User registerUser(User user) {
        return userRepo.save(user);
    }

    // Login user
    public User login(String email, String password) {
        User user = userRepo.findByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

    // Find user by email
    public User findByEmail(String email) {
        return userRepo.findByEmail(email);
    }

    // Reset password
    public void resetPassword(String email, String newPassword) {
        User user = userRepo.findByEmail(email);
        if (user != null) {
            user.setPassword(newPassword);
            userRepo.save(user);
        }
    }

    // Get all users (Admin)
    public java.util.List<User> getAllUsers() {
        return userRepo.findAll();
    }
}
