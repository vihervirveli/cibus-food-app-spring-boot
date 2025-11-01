package com.example.app.repository;

import com.example.app.model.FoodRecipe;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRecipeRepository extends JpaRepository<FoodRecipe, Integer> {
}
