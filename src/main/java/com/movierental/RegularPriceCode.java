package com.movierental;

public class RegularPriceCode extends PriceCode{
    @Override
    public double rentalAmount(int daysRented) {
        double rentalAmount = 2;
        if (daysRented > 2)
            rentalAmount += (daysRented - 2) * 1.5;
        return rentalAmount;
    }

    @Override
    public int value() {
        return Movie.REGULAR;
    }
}
