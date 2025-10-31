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

    @Test
    public void testCountCities_countsAccurately() {
        CustomList list = new CustomList();

        // empty list
        assertEquals(0, list.countCities());

        // add two cities
        City cal = new City("Calgary", "AB");
        City edm = new City("Edmonton", "AB");
        list.addCity(cal);
        list.addCity(edm);
        assertEquals(2, list.countCities());

        // delete one and re-check
        list.deleteCity(cal);   // deleting same instance to avoid equals() issues
        assertEquals(1, list.countCities());
    }




}
