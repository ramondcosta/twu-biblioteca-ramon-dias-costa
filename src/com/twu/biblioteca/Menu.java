package com.twu.biblioteca;

import com.twu.biblioteca.Options.CatalogOption;
import com.twu.biblioteca.Options.HomeOption;
import com.twu.biblioteca.contracts.Option;
import com.twu.biblioteca.models.Book;
import com.twu.biblioteca.utils.Parser;

import java.util.*;

public class Menu {

    private Option currentOption;
    private HomeOption home;

    public Menu(){
        this.home = new HomeOption();
        this.currentOption = this.home;
    }

    public void run(){

        boolean shouldBeRunning = true;

        while (shouldBeRunning){
            for (int i = 0; i < currentOption.options.size(); i++) {
                int optionNumber = i + 1;
                System.out.println(optionNumber + ". " + currentOption.options.get(i));
            }

            Scanner scanner = new Scanner(System.in);
            int optionIndex = -1;
            Parser parser = new Parser();
            while (optionIndex == -1){
                optionIndex = parser.parseOptionIndex(scanner.nextLine(), currentOption.options);
                if(optionIndex == -1) System.out.println("Please select a valid option");
            }

            Option selectedOption = this.currentOption.options.get(optionIndex);
            selectedOption.run();
            System.out.println(selectedOption.content);

            this.currentOption = selectedOption.options.size() == 0 ? home : selectedOption;
        }
    }
}
