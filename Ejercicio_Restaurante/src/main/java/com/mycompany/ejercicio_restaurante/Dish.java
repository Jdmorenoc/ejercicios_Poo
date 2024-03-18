package com.mycompany.ejercicio_restaurante;

import com.mycompany.ejercicio_restaurante.DishType;

public class Dish {
    private DishType Type;
    private String name; 
    private String ingredients;
    private int price;
    private int qty;

    public Dish(DishType Type, String name, String ingredients, int price, int qty) {
        this.Type = Type;
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
        this.qty = qty;
    }
    
}
