
package com.mycompany.ejercicio_1;

import Books.Book;

public class Ejercicio_1 {

    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter",5,25,"Fantasia");
        Book book2 = new Book("El nombre del bien", 1, 28, "Fantasia");
        
        //Presto el Libro 
        book1.lendBook();
        book1.isAvailable();
        System.out.println(book1.isAvailable());
        System.out.println(book2.isAvailable());
    }   
       }
   
