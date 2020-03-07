package com.movierental;

import java.util.List;

public class Rentals {
    List<Rental> rentals;

    public Rentals(List<Rental> rentals) {
        this.rentals = rentals;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public double totalAmount() {
        double totalAmount = 0;
        for (Rental rental : rentals) {
            double rentalAmount = rental.amount();
            totalAmount += rentalAmount;
        }
        return totalAmount;
    }

    public int frequentRenterPoints() {
        int frequentRenterPoints = 0;
        for (Rental rental : rentals) {
            frequentRenterPoints += rental.frequentRentalPoints();
        }
        return frequentRenterPoints;
    }
}
