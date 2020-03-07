package com.movierental;

import java.util.List;

public class Rentals {
    List<Rental> rentals;
    double totalAmount;
    int frequentRenterPoints;

    public Rentals(List<Rental> rentals, double totalAmount, int frequentRenterPoints) {
        this.rentals = rentals;
        this.totalAmount = totalAmount;
        this.frequentRenterPoints = frequentRenterPoints;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public int getFrequentRenterPoints() {
        return frequentRenterPoints;
    }
}
