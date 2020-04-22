package com.twu.biblioteca.data;

import com.twu.biblioteca.models.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class BooksStore {
    public static ArrayList<Book> books = new ArrayList<Book>((Arrays.asList(
            new Book(
                    "A feast of crows",
                    "George R.R Martin",
                    new GregorianCalendar(1996, Calendar.AUGUST,1)),
            new Book(
                    "O príncipe",
                    "Niccolò di Bernardo dei Machiavelli",
                    new GregorianCalendar(1513, Calendar.AUGUST,1))
    )));

    public static ArrayList<Book>getBooks(){
        return BooksStore.books;
    }
}
