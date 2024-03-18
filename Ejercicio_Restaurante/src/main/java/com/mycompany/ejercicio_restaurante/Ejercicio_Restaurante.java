package com.mycompany.ejercicio_restaurante;

public class Ejercicio_Restaurante {

    public static void main(String[] args) {
        Customer student = new Customer (CustomerRole.STUDENT, "1", "Pepito Perez" );
        student.sellFood();
        
        Customer administrative = new Customer (CustomerRole.ADMINISTRATIVE, "2", "Julanito de tal");
        administrative.sellFood();
        
        Menu menu = new Menu(); 
        
        Dish breakfast1 = new Dish(DishType.BREAKFAST, "Huevos fritos", "Huevos", 2400, 20);
        Dish breakfast2 = new Dish(DishType.BREAKFAST, "Caldo", "Carne, Papa, ajo ", 4000, 10);
        Dish lunch = new Dish(DishType.LUNCH, "Pastas a la boloñesa", "Pastas, Boloñesa", 10000, 8);
        
        menu.addDish(breakfast1);
        menu.addDish(breakfast2);
        menu.addDish(lunch);
    }
}
