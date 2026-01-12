package com.yumstop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.yumstop.repository.FoodRepository;

@Controller
public class FoodController {

    @Autowired
    private FoodRepository foodRepo;

    @GetMapping("/menu")
    public String menuPage(Model model) {
        model.addAttribute("foods", foodRepo.findAll());
        return "menu";
    }
}
