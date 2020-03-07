package com.movierental;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        double totalAmount = 0;
        for (Rental rental : rentals) {
            double rentalAmount = rental.amount();
            totalAmount += rentalAmount;
        }
        int frequentRenterPoints = 0;
        for (Rental rental : rentals) {
            frequentRenterPoints += rental.frequentRentalPoints();
        }
        return new TextStatement(new Rentals(rentals), name).statement();
    }


    public String htmlStatement() {
        double totalAmount = 0;
        for (Rental rental : rentals) {
            double rentalAmount = rental.amount();
            totalAmount += rentalAmount;
        }
        int frequentRenterPoints = 0;
        for (Rental rental : rentals) {
            frequentRenterPoints += rental.frequentRentalPoints();
        }
        return new HtmlStatement(new Rentals(rentals), name).statement();
    }



}

