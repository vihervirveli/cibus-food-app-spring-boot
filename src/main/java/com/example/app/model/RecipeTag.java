package com.example.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This class represents the table recipe_tag in the database
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "recipe_tag")
public class RecipeTag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer tagId;
    private Integer recipeId;
}
