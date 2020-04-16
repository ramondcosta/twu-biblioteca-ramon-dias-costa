package com.twu.biblioteca;

import java.util.ArrayList;

public class Catalog {

    private ArrayList<Book> bookList;

    Catalog(ArrayList<Book> bookList){
        this.bookList = bookList;
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
