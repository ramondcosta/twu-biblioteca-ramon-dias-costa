package com.twu.biblioteca;

import com.twu.biblioteca.models.Book;
import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.Assert.assertEquals;

public class BookTest {

    @Test
    public void bookShouldBeTransformedToString(){

        // given
        GregorianCalendar publicationYear = new GregorianCalendar(1996, Calendar.AUGUST,1);
        Book newBook = new Book("A Game of Thrones", "George R.R Martin", publicationYear);
        String expectedBookDescription = "Name: A Game of Thrones | Author: George R.R Martin | Release Year: 1996";
        //when
        String bookDescription = newBook.toString();
        //then
        assertEquals(expectedBookDescription, bookDescription);

    }
}
