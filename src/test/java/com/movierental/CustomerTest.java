package com.movierental;

import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {
    @Test
    public void testStatement() {
        Movie regularMovie = new Movie("Regular Movie", Movie.REGULAR);
        Movie newRelease = new Movie("New Release Movie", Movie.NEW_RELEASE);
        Movie childrenMovie = new Movie("Children Movie", Movie.CHILDRENS);

        Customer customer = new Customer("Surendran");
        customer.addRental(new Rental(regularMovie, 3));
        customer.addRental(new Rental(childrenMovie, 4));
        customer.addRental(new Rental(newRelease, 3));

        Assert.assertEquals("Rental Record for Surendran\n" +
                "\tRegular Movie\t3.5\n" +
                "\tChildren Movie\t3.0\n" +
                "\tNew Release Movie\t9.0\n" +
                "Amount owed is 15.5\n" +
                "You earned 4 frequent renter points", customer.statement());
    }

}