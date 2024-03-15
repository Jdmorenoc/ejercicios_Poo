package com.mycompany.ejercicio_restaurante;

import people.Customer;
import values.CustomerRole;


public class Ejercicio_Restaurante {

    public static void main(String[] args) {
        Customer student = new Customer (CustomerRole.STUDENT, "1", "Pepito Perez" );
        student.sellFood();
        
        Customer administrative = new Customer (CustomerRole.ADMINISTRATIVE, "2", "Julanito de tal");
        administrative.sellFood();
    }
}
