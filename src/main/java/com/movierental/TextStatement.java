package com.movierental;

class TextStatement {

    private final Rentals rentals;
    private final String name;

    public TextStatement(Rentals rentals, String name) {
        this.rentals = rentals;
        this.name = name;
    }

    public String statement() {
        return header() + body() + footer();
    }

    private String header() {
        return "Rental Record for " + name + "\n";
    }

    private String body() {
        String result = "";
        for (Rental rental : rentals.getRentals()) {
            //show figures for this rental
            result += "\t" + rental.getMovie().getTitle() + "\t" + rental.amount() + "\n";
        }
        return result;
    }

    private String footer() {
        String result = "" + ("Amount owed is " + rentals.totalAmount() + "\n");
        result += "You earned " + rentals.frequentRenterPoints() + " frequent renter points";
        return result;
    }
}
