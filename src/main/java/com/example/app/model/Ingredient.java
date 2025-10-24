package com.example.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * 
 * In a recipe, this is the ingredient - amount pair, eg. 300g potatoes.
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "ingredient")
public class Ingredient {

    @Id
    private Integer Id;
    private String IngredientName;
    private String Quantity;
}
