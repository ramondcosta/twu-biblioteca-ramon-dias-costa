package com.twu.biblioteca;

import com.twu.biblioteca.utils.TextFn;

public class SubMenu {

    public String description;

    public SubMenu(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return this.description;
    }
}
