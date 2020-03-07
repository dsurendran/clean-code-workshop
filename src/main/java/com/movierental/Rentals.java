package com.movierental;

import java.util.ArrayList;

public class Rentals extends ArrayList<Rental> {

    public double totalAmount() {
        double totalAmount = 0;
        for (Rental rental : this) {
            double rentalAmount = rental.amount();
            totalAmount += rentalAmount;
        }
        return totalAmount;
    }

    public int frequentRenterPoints() {
        int frequentRenterPoints = 0;
        for (Rental rental : this) {
            frequentRenterPoints += rental.frequentRentalPoints();
        }
        return frequentRenterPoints;
    }

}
