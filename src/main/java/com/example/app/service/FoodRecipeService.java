package com.example.app.service;

import com.example.app.model.Food;
import com.example.app.model.FoodRecipe;
import com.example.app.repository.FoodRecipeRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class FoodRecipeService {
    private final FoodRecipeRepository foodRecipeRepository;

    /**
     * @return all the foodRecipes
     */
    public List<FoodRecipe> getAllFoodRecipes() {
        return foodRecipeRepository.findAll();
    }

    /**
     * @return returns a single foodRecipe by its id
     */
    public FoodRecipe getFoodRecipeById(Integer id) {
        return foodRecipeRepository.findById(id).orElse(null);
    }

    /**
     * saves a foodRecipe to the repository
     * 
     * @param foodRecipe - foodRecipe to save
     * 
     * @return the saved foodRecipe
     */
    public FoodRecipe saveFoodRecipe(FoodRecipe foodRecipe) {
        FoodRecipe savedFoodRecipe = foodRecipeRepository.save(foodRecipe);
        log.info("FoodRecipe with id: {} saved successfully", foodRecipe.getId());
        return savedFoodRecipe;
    }
}
