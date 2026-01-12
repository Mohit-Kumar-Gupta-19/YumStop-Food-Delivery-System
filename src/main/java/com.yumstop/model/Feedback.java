package com.yumstop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @SuppressWarnings("unused")
    private Long id;

    @SuppressWarnings("unused")
    private String name;
    @SuppressWarnings("unused")
    private String email;
    @SuppressWarnings("unused")
    private String message;

    // getters & setters
}
