package com.example.cardapio.entities;

public record FoodDTO(Long id, String name, String image, Double price) {
    public FoodDTO(Food food) {
        this(food.getId(), food.getName(), food.getImage(), food.getPrice());
    }
}
