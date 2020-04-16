package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class CatalogTest {
    @Test
    public void shouldPrintSameQuantityThatBookList(){

        //given
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
        //when
        ArrayList<String> currentBooksDescription = currentCatalog.printListOfBooks();
        ArrayList<Book> currentCatalogedBooks = currentCatalog.getAllBooks();
        //then
        assertEquals(currentCatalogedBooks.size(), currentBooksDescription.size());
    }

    @Test
    public void shouldPrintTheFormatedDescription(){

        //given
        ArrayList<Book> bookList = new ArrayList<Book>(Arrays.asList(
                new Book(
                        "A feast of crows",
                        "George R.R Martin",
                        new GregorianCalendar(1996, Calendar.AUGUST,1))
        ));
        Catalog currentCatalog = new Catalog(bookList);
        String expectedBookDescription = "Name: A feast of crows | Author: George R.R Martin | Release Year: 1996";
        //when
        ArrayList<String> currentBooksDescription = currentCatalog.printListOfBooks();
        String bookDescription = currentBooksDescription.get(0);
        //then
        assertEquals(expectedBookDescription, bookDescription);
    }
}
