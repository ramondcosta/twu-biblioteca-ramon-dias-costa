package com.twu.biblioteca.Options;

import com.twu.biblioteca.Catalog;
import com.twu.biblioteca.contracts.Option;
import com.twu.biblioteca.data.BooksStore;

import java.util.ArrayList;
import java.util.Arrays;

public class HomeOption extends Option {

    public HomeOption(){
        Catalog catalog = new Catalog(BooksStore.getBooks());
        this.options = new ArrayList<Option>(Arrays.asList(
            new CatalogOption("List of Books", catalog),
            new QuitOption()
        ));
    }

    @Override
    public void run() {

    }
}
