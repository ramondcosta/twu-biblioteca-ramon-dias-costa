package com.twu.biblioteca.subMenus;

import com.twu.biblioteca.Catalog;
import com.twu.biblioteca.SubMenu;

public class CatalogMenu extends SubMenu {

    private String content = "";


    public CatalogMenu(String description, Catalog catalog) {
        super(description);
        for (String bookDescription: catalog.printListOfBooks()) {
            content += bookDescription + "\n";
        }
    }

    public String getContent() {
        return content;
    }

}
