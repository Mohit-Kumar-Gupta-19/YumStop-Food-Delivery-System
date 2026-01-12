package com.yumstop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yumstop.model.Food;
import com.yumstop.repository.FoodRepository;

@Service
public class FoodService {

    @Autowired
    private FoodRepository foodRepo;

    // Fetch all food items
    public List<Food> getAllFoods() {
        return foodRepo.findAll();
    }

    // Add new food (Admin)
    public Food addFood(Food food) {
        return foodRepo.save(food);
    }

    // Get food by ID
    public Object getFoodById(Long id) {
        return foodRepo.findById(id).orElse(null);
    }

    // Delete food (optional admin feature)
    public void deleteFood(Long id) {
        foodRepo.deleteById(id);
    }
}
