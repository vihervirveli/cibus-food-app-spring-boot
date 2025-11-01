package com.example.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    // Cheese
    private String name;
    // Coop
    private String brand;
    // Kermajuusto
    private String product;
    // calories per 100g
    private Double calories;

    /*
     * Getter for id
     * 
     * @return id
     */
    public Integer getId() {
        return id;
    }

}
