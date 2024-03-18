package com.mycompany.ejercicio_restaurante;

import java.util.ArrayList;

public class Menu {
    
    private ArrayList<Dish> dishlist;
    
    public Menu() {
        this.dishlist = new ArrayList<>();
    }
    
    public void addDish(Dish dish) {
        this.dishlist.add (dish);
    }
}
