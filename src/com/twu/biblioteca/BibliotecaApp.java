package com.twu.biblioteca;

import java.util.Date;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println("Welcome to Bibilioteca, Your one-stop-shop for great book titles in Bangalore!\n\n");
        Catalog currentCatalog = new Catalog();

        for (String bookDescription: currentCatalog.printListOfBooks()) {
            System.out.println(bookDescription);
        }
    }

}
