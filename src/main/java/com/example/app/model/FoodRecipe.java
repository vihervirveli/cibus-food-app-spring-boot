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
 * 
 * In a recipe, this is the quantity - ingredient pair, eg. 300g potatoes.
 * 300 is the quantity, gram the descriptor
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "food_recipe")
public class FoodRecipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    // which food this is referring to, Foreign Key
    private Integer foodId;
    private Integer recipeId;
    private Double quantity;
    private String descriptor;
}
