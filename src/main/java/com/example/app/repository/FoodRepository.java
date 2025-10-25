package com.example.app.repository;
import com.example.app.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

/*
 * This repository provides access to data in the database
 */
public interface FoodRepository extends JpaRepository<Food, Integer> {
}
