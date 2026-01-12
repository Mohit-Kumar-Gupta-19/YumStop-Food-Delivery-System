package com.yumstop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @SuppressWarnings("unused")
    private Long id;

    @SuppressWarnings("unused")
    private String name;
    @SuppressWarnings("unused")
    private double price;
    @SuppressWarnings("unused")
    private final String imageUrl;

    public Food(Long id, String imageUrl, String name, double price) {
        this.id = id;
        this.imageUrl = imageUrl;
        this.name = name;
        this.price = price;
    }

    // getters & setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }
}
