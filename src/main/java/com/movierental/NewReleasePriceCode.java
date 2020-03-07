package com.movierental;

public class NewReleasePriceCode extends PriceCode{

    @Override
    public double rentalAmount(int daysRented) {
        return daysRented * 3;
    }

    @Override
    public int value() {
        return Movie.NEW_RELEASE;
    }
}
