package com.example.app.controller;

import com.example.app.model.FoodRecipe;
import com.example.app.model.Recipe;
import com.example.app.service.FoodRecipeService;
import com.example.app.service.FoodService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/v1/foodrecipe")
public class FoodRecipeController {

    private final FoodRecipeService foodRecipeService;

    /**
     * Constructor
     * 
     * @param foodRecipeService
     */
    public FoodRecipeController(FoodRecipeService foodRecipeService) {
        this.foodRecipeService = foodRecipeService;
    }

    /**
     * GET request for returning all the recipes
     * URL: localhost:8080/foodrecipe/v1/
     * 
     * @return all foodRecipes
     */
    @GetMapping("/")
    public ResponseEntity<List<FoodRecipe>> getAllFoodRecipes() {
        return ResponseEntity.ok().body(foodRecipeService.getAllFoodRecipes());
    }

    /**
     * GET request for fetching one foodRecipe with given id
     * URL: localhost:8080/foodrecipe/v1/{id}
     * 
     * @param id
     * @return one foodRecipe
     */
    @GetMapping("/{id}")
    public ResponseEntity<FoodRecipe> getRecipeById(@PathVariable Integer id) {
        return ResponseEntity.ok().body(foodRecipeService.getFoodRecipeById(id));
    }

    /**
     * POST request for saving a foodRecipe to the repository
     * URL: localhost:8080/foodrecipe/v1/
     * 
     * @param foodRecipe - Request body is a FoodRecipe entity
     * @return Saved FoodRecipe entity
     */
    @PostMapping("/")
    public ResponseEntity<FoodRecipe> saveFoodRecipe(@RequestBody FoodRecipe foodRecipe) {
        return ResponseEntity.ok().body(foodRecipeService.saveFoodRecipe(foodRecipe));
    }
}
