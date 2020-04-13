package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CatalogTest {
    @Test
    public void shouldPrintSameQuantityThatBookList(){

        //given
        Catalog currentCatalog = new Catalog();
        //when
        ArrayList<String> currentBooksDescription = currentCatalog.printListOfBooks();
        ArrayList<Book> currentCatalogedBooks = currentCatalog.getAllBooks();
        //then
        assertEquals(currentCatalogedBooks.size(), currentBooksDescription.size());
    }
}
