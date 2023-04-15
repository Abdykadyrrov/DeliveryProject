package com.example.deliveryproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Trainers {
    @Id
    private Long id;
    private String title;
    private String image;
    private double price;
    private String gender;
    private String description;

    public Trainers(String title, String image, double price, String gender, String description) {
        this.title = title;
        this.image = image;
        this.price = price;
        this.gender = gender;
        this.description = description;
    }
}
