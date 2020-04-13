package com.twu.biblioteca;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Catalog {

    private ArrayList<Book> bookList;

    Catalog(){
        this.bookList = new ArrayList<Book>(Arrays.asList(
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

    }

    public ArrayList<String> printListOfBooks() {
        ArrayList<String> booksDescriptions = new ArrayList<String>();
        for (Book book: this.bookList) {
            booksDescriptions.add(book.toString());
        }
        return booksDescriptions;
    }

    public ArrayList<Book> getAllBooks() {
        return this.bookList;
    }
}
