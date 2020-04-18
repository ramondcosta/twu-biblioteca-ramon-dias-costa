package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;

public class Menu {

    private ArrayList<SubMenu> subMenus;

    public Menu(){
        this.subMenus = new ArrayList<SubMenu>(Arrays.asList(
                new SubMenu("List of Books")
        ));
    }

    public ArrayList<SubMenu> getSubMenus() {
        return subMenus;
    }

}
