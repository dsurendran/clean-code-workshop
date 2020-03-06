package com.movierental;

public class Rental {

    private int daysRented;
    private Movie movie;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    double amount() {
        return movie.rentalAmount(daysRented);
    }

    int frequentRentalPoints() {
        return movie.frequentRentalPoints(daysRented);
    }

}