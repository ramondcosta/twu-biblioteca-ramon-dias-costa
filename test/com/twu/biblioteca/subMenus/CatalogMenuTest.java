package com.twu.biblioteca.subMenus;

import com.twu.biblioteca.Catalog;
import com.twu.biblioteca.SubMenu;
import com.twu.biblioteca.models.Book;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.Assert.*;

public class CatalogMenuTest {
    @Test
    public void shouldPrintCorrectMenuContent(){
        // Given
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
        CatalogMenu catalogMenu = new CatalogMenu("", currentCatalog);
        String expectedContent = "Name: A feast of crows | Author: George R.R Martin | Release Year: 1996\n" +
                "Name: O príncipe | Author: Niccolò di Bernardo dei Machiavelli | Release Year: 1513\n";
        // When
        String actualContent = catalogMenu.getContent();
        // Then
        assertEquals(expectedContent, actualContent);
    }

}