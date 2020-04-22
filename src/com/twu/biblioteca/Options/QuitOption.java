package com.twu.biblioteca.Options;

import com.twu.biblioteca.contracts.Option;

public class QuitOption extends Option {

    QuitOption (){
        this.description = "Quit";
    }

    @Override
    public void run() {
        System.exit(0);
    }

    @Override
    public String toString() {
        return this.description;
    }
}
