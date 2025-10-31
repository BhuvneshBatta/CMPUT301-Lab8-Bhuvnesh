package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {

    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);

        // This will fail initially because hasCity() doesn't exist yet
        assertTrue(list.hasCity(calgary));
    }
    @Test
    public void testDeleteCity_removesCity() {
        CustomList list = new CustomList();
        City edm = new City("Edmonton", "AB");
        City cal = new City("Calgary", "AB");

        list.addCity(edm);
        list.addCity(cal);

        list.deleteCity(cal);

        assertFalse(list.hasCity(cal));  // should be gone
        assertTrue(list.hasCity(edm));   // other city still there
    }



}
