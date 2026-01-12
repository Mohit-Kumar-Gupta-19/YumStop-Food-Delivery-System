package com.yumstop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @SuppressWarnings("unused")
    private Long id;

    @SuppressWarnings("unused")
    private String foodName;
    @SuppressWarnings("unused")
    private double price;
    @SuppressWarnings("unused")
    private String status;

    @ManyToOne
    @SuppressWarnings("unused")
    private User user;

    // getters & setters
}
