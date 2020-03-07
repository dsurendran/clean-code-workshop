package com.movierental;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MovieTest {

    @Test
    public void testRegularMovieRentalAmount() {
        Movie regularMovie = new Movie("Regular Movie", Movie.REGULAR);
        assertEquals(14.0, regularMovie.rentalAmount(10),0);

    }
    @Test
    public void testChildrenMovieRentalAmount() {
        Movie childrenMovie = new Movie("Children Movie", Movie.CHILDRENS);
        assertEquals(12.0, childrenMovie.rentalAmount(10),0);

    }
    @Test
    public void testNewReleaseMovieRentalAmount() {
        Movie newRelease = new Movie("New Release Movie", Movie.NEW_RELEASE);
        assertEquals(30.0, newRelease.rentalAmount(10),0);
    }

    @Test
    public void testUnknownMovieRentalAmount() {
        Movie newRelease = new Movie("New Release Movie", 10 );
        assertEquals(0, newRelease.rentalAmount(10),0);
    }
}
