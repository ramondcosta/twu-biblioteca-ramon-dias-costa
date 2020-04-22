package com.twu.biblioteca.Options;

import com.twu.biblioteca.Catalog;
import com.twu.biblioteca.models.Book;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.Assert.assertEquals;

public class CatalogOptionTest {
    @Test
    public void shouldGetCorrectDescription(){
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
        CatalogOption catalogOption = new CatalogOption("List of Books", currentCatalog);
        String expectedDescription = "List of Books";
        // When
        String actualDescription = catalogOption.toString();
        // Then
        assertEquals(actualDescription, expectedDescription);
    }
}
