package com.twu.biblioteca.contracts;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Option {
    public String description = "";
    public String content = "";
    public ArrayList<Option> options = new ArrayList<Option>(Arrays.asList());
    public abstract void run();
}
