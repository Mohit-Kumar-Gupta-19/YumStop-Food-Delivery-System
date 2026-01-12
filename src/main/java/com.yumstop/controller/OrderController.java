package com.yumstop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.yumstop.model.Order;
import com.yumstop.model.User;
import com.yumstop.repository.OrderRepository;

import jakarta.servlet.http.HttpSession;

@Controller
public class OrderController {

    @Autowired
    private OrderRepository orderRepo;

    @GetMapping("/order/{food}/{price}")
    public String placeOrder(@PathVariable String food,
                             @PathVariable double price,
                             HttpSession session) {

        User user = (User) session.getAttribute("user");

        Order order = new Order();
        order.setFoodName(food);
        order.setPrice(price);
        order.setStatus("Pending");
        order.setUser(user);

        orderRepo.save(order);
        return "redirect:/payment";
    }

    @GetMapping("/payment")
    public String paymentPage() {
        return "payment";
    }

    @GetMapping("/success")
    public String success(HttpSession session) {
        return "success";
    }

    @GetMapping("/orders")
    public String orderHistory(HttpSession session, Model model) {
        User user = (User) session.getAttribute("user");
        model.addAttribute("orders", orderRepo.findByUser(user));
        return "orders";
    }
}
