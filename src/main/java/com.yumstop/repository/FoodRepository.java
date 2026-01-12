package com.yumstop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.yumstop.model.Food;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
