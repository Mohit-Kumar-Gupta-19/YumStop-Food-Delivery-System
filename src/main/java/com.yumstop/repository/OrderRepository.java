package com.yumstop.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.yumstop.model.Order;
import com.yumstop.model.User;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByUser(User user);
}
