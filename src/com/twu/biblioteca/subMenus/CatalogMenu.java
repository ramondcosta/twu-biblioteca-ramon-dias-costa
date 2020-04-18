package com.twu.biblioteca.subMenus;

import com.twu.biblioteca.Catalog;
import com.twu.biblioteca.SubMenu;

public class CatalogMenu extends SubMenu {

    public CatalogMenu(String description, Catalog catalog) {
        super(description);
        for (String bookDescription : catalog.printListOfBooks()) {
            this.content += bookDescription + "\n";
        }
    }

}
