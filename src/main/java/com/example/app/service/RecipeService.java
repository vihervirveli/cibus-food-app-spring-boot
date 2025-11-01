package com.example.app.service;

import com.example.app.model.Recipe;
import com.example.app.repository.RecipeRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class RecipeService {
    private final RecipeRepository recipeRepository;

    /**
     * Returns all the recipes
     * 
     * @return all recipes
     */
    public List<Recipe> getAllRecipes() {
        return recipeRepository.findAll();
    }

    /**
     * Return single recipe
     * 
     * @param id
     * @return one recipe by its id
     */
    public Recipe getRecipeById(Integer id) {
        return recipeRepository.findById(id).orElse(null);
    }

    /**
     * Save a recipe into repository
     * 
     * @param recipe
     * @return saved recipe
     */
    public Recipe saveRecipe(Recipe recipe) {
        Recipe savedRecipe = recipeRepository.save(recipe);
        log.info("Recipe with id: {} saved successfully", recipe.getId());
        return savedRecipe;
    }
}
