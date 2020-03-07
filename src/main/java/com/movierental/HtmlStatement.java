package com.movierental;

public class HtmlStatement {

    private final Rentals rentals;
    private final String name;

    public HtmlStatement(Rentals rentals, String name) {
        this.rentals = rentals;
        this.name = name;
    }

    public String statement() {
        return htmlHeader() + htmlBody() + htmlFooter();
    }

    private String htmlHeader() {
        return "<h1>Rental Record for <b>" + name + "</b></h1><br/>";
    }

    private String htmlBody() {
        String result = "";
        for (Rental rental : rentals) {
//            show figures for this rental
            result += " " + rental.getMovie().getTitle() + " <b>" + rental.amount() + "</b><br/>";
        }
        return result;
    }

    private String htmlFooter() {
        String result = "";
        result += "Amount owed is <b>" + rentals.totalAmount() + "</b><br/>";
        result += "You earned <b>" + rentals.frequentRenterPoints()
                + "</b> frequent renter points<br/>";
        return result;
    }
}
