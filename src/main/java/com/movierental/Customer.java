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
        return new TextStatement(new Rentals(rentals, totalAmount, frequentRenterPoints), name).statement();
    }

    private double totalAmount() {
        double totalAmount = 0;
        for (Rental rental : rentals) {
            double rentalAmount = rental.amount();
            totalAmount += rentalAmount;
        }
        return totalAmount;
    }

    private int frequentRenterPoints() {
        int frequentRenterPoints = 0;
        for (Rental rental : rentals) {
            frequentRenterPoints += rental.frequentRentalPoints();
        }
        return frequentRenterPoints;
    }


    public String htmlStatement() {
        return htmlHeader() + htmlBody() + htmlFooter();
    }

    private String htmlHeader() {
        return "<h1>Rental Record for <b>" + name + "</b></h1><br/>";
    }

    private String htmlBody() {
        String result = "";
        for (Rental rental : rentals) {
            //show figures for this rental
            result += " " + rental.getMovie().getTitle() + " <b>" + rental.amount() + "</b><br/>";
        }
        return result;
    }

    private String htmlFooter() {
        String result = "";
        result += "Amount owed is <b>" + totalAmount() + "</b><br/>";
        result += "You earned <b>" + frequentRenterPoints()
                + "</b> frequent renter points<br/>";
        return result;
    }

}

