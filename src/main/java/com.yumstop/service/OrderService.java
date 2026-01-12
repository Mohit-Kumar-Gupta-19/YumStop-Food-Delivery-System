package com.yumstop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yumstop.model.Order;
import com.yumstop.model.User;
import com.yumstop.repository.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepo;

    // Place new order
    public Order placeOrder(String foodName, double price, User user) {
        Order order = new Order();
        order.setFoodName(foodName);
        order.setPrice(price);
        order.setStatus("Confirmed");
        order.setUser(user);
        return orderRepo.save(order);
    }

    // Get orders of logged-in user
    public List<Order> getOrdersByUser(User user) {
        return orderRepo.findByUser(user);
    }

    // Get all orders (Admin)
    public List<Order> getAllOrders() {
        return orderRepo.findAll();
    }

    // Update order status (Admin – future use)
    public void updateOrderStatus(Long orderId, String status) {
        Order order = orderRepo.findById(orderId).orElse(null);
        if (order != null) {
            order.setStatus(status);
            orderRepo.save(order);
        }
    }
}
