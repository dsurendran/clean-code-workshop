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

    @Test
    public void shouldPrintHtmlStatement(){
        Customer customer = new Customer("John");
        Rental regularRental = new Rental(new Movie("Regular", Movie.REGULAR), 3);
        Rental newReleaseRental = new Rental(new Movie("NewRelease", Movie.NEW_RELEASE), 3);
        Rental childrenRental = new Rental(new Movie("Children", Movie.REGULAR), 3);
        customer.addRental(regularRental);
        customer.addRental(newReleaseRental);
        customer.addRental(childrenRental);
        Assert.assertEquals("<h1>Rental Record for <b>John</b></h1><br/> " +
                "Regular <b>3.5</b><br/> " +
                "NewRelease <b>9.0</b><br/> " +
                "Children <b>3.5</b><br/>" +
                "Amount owed is <b>16.0</b><br/>" +
                "You earned <b>4</b> frequent renter points<br/>", customer.htmlStatement());

    }

}