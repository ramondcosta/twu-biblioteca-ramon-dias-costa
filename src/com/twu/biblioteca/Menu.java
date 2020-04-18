package com.twu.biblioteca;

import com.twu.biblioteca.models.Book;
import com.twu.biblioteca.subMenus.CatalogMenu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Menu {

    private ArrayList<SubMenu> subMenus;

    public Menu(){
        ArrayList<Book> bookList = new ArrayList<Book>(Arrays.asList(
                new Book(
                        "A feast of crows",
                        "George R.R Martin",
                        new GregorianCalendar(1996, Calendar.AUGUST,1)),
                new Book(
                        "O príncipe",
                        "Niccolò di Bernardo dei Machiavelli",
                        new GregorianCalendar(1513, Calendar.AUGUST,1))
//                new Book("A feast of crows", "George R.R Martin", new Date()),
        ));
        Catalog currentCatalog = new Catalog(bookList);
        this.subMenus = new ArrayList<SubMenu>(Arrays.asList(
                new CatalogMenu("List of Books", currentCatalog)
        ));
    }

    public ArrayList<SubMenu> getSubMenus() {
        return subMenus;
    }

}
