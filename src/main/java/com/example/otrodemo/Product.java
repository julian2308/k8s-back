package com.example.otrodemo;

import jakarta.persistence.*;

@Table
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String value;

    public Product(String value) {
        this.value = value;
    }

    public Product() {
    }

    public String getValue() {
        return value;
    }
}
