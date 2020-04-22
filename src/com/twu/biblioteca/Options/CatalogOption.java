package com.twu.biblioteca.Options;

import com.twu.biblioteca.Catalog;
import com.twu.biblioteca.contracts.Option;

public class CatalogOption extends Option {

    public CatalogOption(String description, Catalog catalog) {
        this.description = description;
        for (String bookDescription : catalog.printListOfBooks()) {
            this.content += bookDescription + "\n";
        }
    }

    @Override
    public void run() {

    }

    @Override
    public String toString() {
        return this.description;
    }
}
