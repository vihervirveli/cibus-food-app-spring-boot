package com.example.app.controller;

import com.example.app.model.Recipe;
import com.example.app.model.RecipeTag;
import com.example.app.service.RecipeTagService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/v1/recipetag")
public class RecipeTagController {
    private final RecipeTagService recipeTagService;

    /**
     * Constructor
     * 
     * @param recipeTagService
     */
    public RecipeTagController(RecipeTagService recipeTagService) {
        this.recipeTagService = recipeTagService;
    }

    /**
     * GET request for returning all the recipeTags
     * URL: localhost:8080/recipetag/v1/
     * 
     * @return all recipeTags
     */
    @GetMapping("/")
    public ResponseEntity<List<RecipeTag>> getAllRecipes() {
        return ResponseEntity.ok().body(recipeTagService.getAllRecipeTags());
    }

    /**
     * GET request for fetching one recipeTag with given id
     * URL: localhost:8080/recipetag/v1/{id}
     * 
     * @param id
     * @return one recipeTag
     */
    @GetMapping("/{id}")
    public ResponseEntity<RecipeTag> getRecipeTagById(@PathVariable Integer id) {
        return ResponseEntity.ok().body(recipeTagService.getRecipeTagById(id));
    }

    /**
     * POST request for saving a recipeTag to the repository
     * URL: localhost:8080/recipetag/v1/
     * 
     * @param recipe - Request body is a RecipeTag entity
     * @return Saved RecipeTag entity
     */
    @PostMapping("/")
    public ResponseEntity<RecipeTag> saveRecipeTag(@RequestBody RecipeTag recipeTag) {
        return ResponseEntity.ok().body(recipeTagService.saveRecipeTag(recipeTag));
    }
}
