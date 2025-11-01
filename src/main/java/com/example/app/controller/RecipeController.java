package com.example.app.controller;

import com.example.app.model.Food;
import com.example.app.model.Recipe;
import com.example.app.service.RecipeService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/v1/recipe")
public class RecipeController {
    private final RecipeService recipeService;

    /**
     * Constructor
     * 
     * @param recipeService
     */
    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    /**
     * GET request for returning all the recipes
     * URL: localhost:8080/recipe/v1/
     * 
     * @return all recipes
     */
    @GetMapping("/")
    public ResponseEntity<List<Recipe>> getAllRecipes() {
        return ResponseEntity.ok().body(recipeService.getAllRecipes());
    }

    /**
     * GET request for fetching one recipe with given id
     * URL: localhost:8080/recipe/v1/{id}
     * 
     * @param id
     * @return one recipe
     */
    @GetMapping("/{id}")
    public ResponseEntity<Recipe> getRecipeById(@PathVariable Integer id) {
        return ResponseEntity.ok().body(recipeService.getRecipeById(id));
    }

    /**
     * POST request for saving a recipe to the repository
     * URL: localhost:8080/recipe/v1/
     * 
     * @param recipe - Request body is a Recipe entity
     * @return Saved Recipe entity
     */
    @PostMapping("/")
    public ResponseEntity<Recipe> saveRecipe(@RequestBody Recipe recipe) {
        return ResponseEntity.ok().body(recipeService.saveRecipe(recipe));
    }
}
