package com.twu.biblioteca.models;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Book {
    private String title;
    private String author;
    private GregorianCalendar releaseDate;

    public Book(String title, String author, GregorianCalendar releaseDate) {
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public GregorianCalendar getReleaseDate() {
        return releaseDate;
    }

    @Override
    public String toString() {

        DateFormat dtf = new SimpleDateFormat("yyyy");

        return "Name: " + title + " |" +
                " Author: " + author + " |" +
                " Release Year: " + dtf.format(releaseDate.getTime());
    }
}
