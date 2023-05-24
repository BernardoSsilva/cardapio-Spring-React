package com.example.cardapio.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cardapio.Repositories.FoodRepository;
import com.example.cardapio.entities.Food;
import com.example.cardapio.entities.FoodDTO;
import com.example.cardapio.entities.FoodRequestDTO;

import jakarta.persistence.SqlResultSetMapping;

@RestController
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodRepository repository;

    @GetMapping
    public List<FoodDTO> getAll() {
        List<FoodDTO> foodList = repository.findAll().stream().map(FoodDTO::new).toList();
        return foodList;
    }

    @PostMapping
    public void saveFood(@RequestBody FoodRequestDTO data) {
        Food foodData = new Food(data);
        repository.save(foodData);
        return;
    }

}
