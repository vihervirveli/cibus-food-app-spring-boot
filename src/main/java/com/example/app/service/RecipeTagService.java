package com.example.app.service;

import com.example.app.model.RecipeTag;
import com.example.app.repository.RecipeTagRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class RecipeTagService {
    private final RecipeTagRepository recipeTagRepository;

    /**
     * Returns all recipeTags
     * 
     * @return all recipeTags
     */
    public List<RecipeTag> getAllRecipeTags() {
        return recipeTagRepository.findAll();
    }

    /**
     * Returns recipeTag by its id
     * 
     * @param id
     * @return one recipeTag by its id
     */
    public RecipeTag getRecipeTagById(Integer id) {
        return recipeTagRepository.findById(id).orElse(null);
    }

    /**
     * Save a recipeTag into repository
     * 
     * @param recipeTag
     * @return saved recipeTag
     */
    public RecipeTag saveRecipeTag(RecipeTag recipeTag) {
        RecipeTag savedRecipeTag = recipeTagRepository.save(recipeTag);
        log.info("RecipeTag with id: {} saved successfully", recipeTag.getId());
        return savedRecipeTag;
    }

}
