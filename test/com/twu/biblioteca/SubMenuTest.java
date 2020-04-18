package com.twu.biblioteca;

import static org.junit.Assert.assertEquals;

import com.twu.biblioteca.utils.TextFn;
import org.junit.Test;

public class SubMenuTest {
    @Test
    public void shouldGetCorrectDescription(){
        // Given
        SubMenu subMenu = new SubMenu("List of Books");
        String expectedDescription = "List of Books";
        // When
        String subMenuDescription = subMenu.toString();
        // Then
        assertEquals(subMenuDescription, expectedDescription);
    }

}
