package ua.od.fabrika.abrus.domain;

import static org.junit.Assert.*;

/**
 * Created by Айси on 13.12.15.
 */
public class BreedsTest {

    @org.junit.Test
    public void testCreateDefault() {
        Breeds breeds = new Breeds();
        assertEquals("Incorrect default number of species", 0, breeds.getSpecies().size());
    }
}