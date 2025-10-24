package com.example.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * The Recipe class represents the recipe table in the database
 */
public class Recipe {

    @Id
    private Integer Id;
    private String Title;
    // approximately how long it takes to prepare the recipe
    private Integer Time;
    private String Preview;
    private Ingredient[] ingredients;
    private String Instructions;
    private String[] Tags;
    private String Image;
    private Integer Ratings;
}
