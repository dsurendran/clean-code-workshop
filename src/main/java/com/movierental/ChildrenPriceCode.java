package com.movierental;

public class ChildrenPriceCode extends PriceCode{
    @Override
    public double rentalAmount(int daysRented) {
        double rentalAmount = 1.5;
        if (daysRented > 3)
            rentalAmount += (daysRented - 3) * 1.5;
        return rentalAmount;
    }

    @Override
    public int value() {
        return Movie.CHILDRENS;
    }
}
