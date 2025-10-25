package com.example.app.controller;
import com.example.app.model.Food;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;
import com.example.app.service.FoodService;
import java.util.List;

@RestController
@RequestMapping("/v1/food")
public class FoodController {

    private final FoodService foodService;

    // Constructor
    public FoodController(FoodService foodService){
        this.foodService = foodService;
    }

    /**
     * GET request for returning all the foods 
     * URL: localhost:8080/food/v1/
     * @return List of Foods
     */
    @GetMapping("/")
    public ResponseEntity<List<Food>> getAllFoods(){
        return ResponseEntity.ok().body(foodService.getAllFoods());
    }

    /*
     * GET request for fetching one food with given id
     * URL: localhost:8080/food/v1/{id}
     */
    @GetMapping("/{id}")
    public ResponseEntity<Food> getFoodById(@PathVariable Integer id){
        return ResponseEntity.ok().body(foodService.getFoodById(id));
    }

    /**
     * POST request for saving a Food to the repository
     * URL: localhost:8080/food/v1/
     * @param food - Request body is a Food entity
     * @return Saved Food entity
     */
    @PostMapping("/")
    public ResponseEntity<Food> saveFood(@RequestBody Food food){
        return ResponseEntity.ok().body(foodService.saveFood(food));
    }
}
