package com.twu.biblioteca;

import java.util.*;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println("Welcome to Bibilioteca, Your one-stop-shop for great book titles in Bangalore!\n\n");

        Menu menu = new Menu();
        for (int i = 0; i < menu.getSubMenus().size(); i++) {
            int optionNumber = i + 1;
            System.out.println( String.valueOf(optionNumber) + ". " + menu.getSubMenus().get(i));
        }
        
    }

}
