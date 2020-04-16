package com.twu.biblioteca;

import java.util.*;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println("Welcome to Bibilioteca, Your one-stop-shop for great book titles in Bangalore!\n\n");

        ArrayList<Book> bookList = new ArrayList<Book>(Arrays.asList(
                new Book(
                        "A feast of crows",
                        "George R.R Martin",
                        new GregorianCalendar(1996, Calendar.AUGUST,1)),
                new Book(
                        "O príncipe",
                        "Niccolò di Bernardo dei Machiavelli",
                        new GregorianCalendar(1513, Calendar.AUGUST,1))
        ));

        Catalog currentCatalog = new Catalog(bookList);

        for (String bookDescription: currentCatalog.printListOfBooks()) {
            System.out.println(bookDescription);
        }
    }

}
