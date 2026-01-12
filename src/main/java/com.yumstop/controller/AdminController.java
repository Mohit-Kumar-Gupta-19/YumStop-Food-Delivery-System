package com.yumstop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.yumstop.model.Order;
import com.yumstop.model.User;
import com.yumstop.repository.OrderRepository;
import com.yumstop.repository.UserRepository;

import jakarta.servlet.http.HttpSession;

@Controller
public class AdminController {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private OrderRepository orderRepo;

    // Admin Dashboard
    @GetMapping("/admin/dashboard")
    public String adminDashboard(HttpSession session, Model model) {

        User user = (User) session.getAttribute("user");

        // simple admin check
        if (user == null || !user.getEmail().equals("admin@yumstop.com")) {
            return "redirect:/";
        }

        List<User> users = userRepo.findAll();
        List<Order> orders = orderRepo.findAll();

        model.addAttribute("users", users);
        model.addAttribute("orders", orders);

        return "admin-dashboard";
    }
}
