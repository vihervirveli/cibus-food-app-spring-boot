package com.example.app.repository;

import com.example.app.model.RecipeTag;
import org.springframework.data.jpa.repository.JpaRepository;

/*
 * This repository provides access to data in the database
 */
public interface RecipeTagRepository extends JpaRepository<RecipeTag, Integer> {

}
