package com.example.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * This represents the food table in the database,
 * providing general information about a food item,
 * eg. potato
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "food")
public class Food {
    @Id
    private Integer Id;
    private String Name;
    // calories per 100g
    private Double Calories;

}
