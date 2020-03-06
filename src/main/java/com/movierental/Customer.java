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
        return header() + body() + footer();
    }


    private String footer() {
        String result = "";
        //add footer lines result
        result += "Amount owed is " + totalAmount() + "\n";
        result += "You earned " + frequentRenterPoints()
                + " frequent renter points";
        return result;
    }

    private String header() {
        return "Rental Record for " + getName() + "\n";
    }

    private String body() {
        String result = "";
        for (Rental rental : rentals) {
            //show figures for this rental
            result += "\t" + rental.getMovie().getTitle() + "\t" + rental.amount() + "\n";
        }
        return result;
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
        return "header";
    }

    private String htmlBody() {
        return "html body";
    }

    private String htmlFooter() {
        return "footer";
    }

}

