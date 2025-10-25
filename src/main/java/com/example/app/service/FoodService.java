package com.example.app.service;
import com.example.app.model.Food;
import com.example.app.repository.FoodRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service 
@RequiredArgsConstructor
@Slf4j
public class FoodService {
    private final FoodRepository foodRepository;

    //returns all the foods
    public List<Food> getAllFoods(){
        return foodRepository.findAll();
    }

    // returns a single food by its id
    public Food getFoodById(Integer id){
        return foodRepository.findById(id).orElse(null);
    }

    // saves a food to the repository
    public Food saveFood(Food food){
        Food savedFood = foodRepository.save(food);
        log.info("Food with id: {} saved successfully", food.getId());
        return savedFood;
    }
}
