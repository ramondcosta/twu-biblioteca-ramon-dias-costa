package com.twu.biblioteca.utils;
import static org.junit.Assert.assertEquals;

import com.twu.biblioteca.Catalog;
import com.twu.biblioteca.Options.CatalogOption;
import com.twu.biblioteca.contracts.Option;
import com.twu.biblioteca.models.Book;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ParserTest {
    @Test
    public void ShouldReturnCorrectOptionIndex(){
        // Given
        Parser parser = new Parser();
        Catalog catalog = new Catalog(new ArrayList<Book>());
        ArrayList<Option> options = new ArrayList<Option>(Arrays.asList(
                new CatalogOption("Catalog", catalog)
        ));
        int expectedIndex = 0;
        String text = "1";
        // When
        int resultedIndex = parser.parseOptionIndex(text, options);
        // Then
        assertEquals(expectedIndex, resultedIndex);
    }

    @Test
    public void ShouldReturnInvalidIndexWhenIsBiggerThanOptionLength(){
        // Given
        Parser parser = new Parser();
        Catalog catalog = new Catalog(new ArrayList<Book>());
        ArrayList<Option> options = new ArrayList<Option>(Arrays.asList(
                new CatalogOption("Catalog", catalog)
        ));
        int expectedIndex = -1;
        String text = "3";
        // When
        int resultedIndex = parser.parseOptionIndex(text, options);
        // Then
        assertEquals(expectedIndex, resultedIndex);
    }

    @Test
    public void ShouldReturnInvalidIndexWhenIsNotAnInteger(){
        // Given
        Parser parser = new Parser();
        Catalog catalog = new Catalog(new ArrayList<Book>());
        ArrayList<Option> options = new ArrayList<Option>(Arrays.asList(
                new CatalogOption("Catalog", catalog)
        ));
        int expectedIndex = -1;
        String text = "opcao 1";
        // When
        int resultedIndex = parser.parseOptionIndex(text, options);
        // Then
        assertEquals(expectedIndex, resultedIndex);
    }

    @Test
    public void ShouldReturnInvalidIndexWhenIsNegative(){
        // Given
        Parser parser = new Parser();
        Catalog catalog = new Catalog(new ArrayList<Book>());
        ArrayList<Option> options = new ArrayList<Option>(Arrays.asList(
                new CatalogOption("Catalog", catalog)
        ));
        int expectedIndex = -1;
        String text = "-3";
        // When
        int resultedIndex = parser.parseOptionIndex(text, options);
        // Then
        assertEquals(expectedIndex, resultedIndex);
    }
}
