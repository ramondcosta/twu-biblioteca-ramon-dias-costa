package com.twu.biblioteca.utils;

import com.twu.biblioteca.contracts.Option;

import java.util.ArrayList;

public class Parser {
    public int parseOptionIndex(String text, ArrayList<Option> options){
        try {
            int option = Integer.parseInt(text) - 1;
            if(option >= options.size() | option < 0){
                return -1;
            }
            return option;
        }
        catch (NumberFormatException e){
            System.out.println("Please select a valid option");
            return  -1;
        }

    }
}
