package com.twu.biblioteca;

import com.twu.biblioteca.subMenus.CatalogMenu;

import java.util.*;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println("Welcome to Bibilioteca, Your one-stop-shop for great book titles in Bangalore!\n\n");

        Menu menu = new Menu();
        for (int i = 0; i < menu.getSubMenus().size(); i++) {
            int optionNumber = i + 1;
            System.out.println(optionNumber + ". " + menu.getSubMenus().get(i));
        }

        Scanner scanner = new Scanner(System.in);
        int option = - 1;
        while (option < 0){
            try {
                option = Integer.parseInt(scanner.nextLine());
                if(option >= menu.getSubMenus().size()+1 | option < 0){
                    System.out.println("Please select a valid option");
                    option = -1;
                }
            }
            catch (NumberFormatException e){
                System.out.println("Please select a valid option");
                option = -1;
            }
        }
        SubMenu catalogMenu = menu.getSubMenus().get(option-1);
        System.out.println(catalogMenu.getContent());

    }

}
