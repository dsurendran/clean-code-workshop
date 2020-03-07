package com.movierental;

public abstract class PriceCode {
    public abstract double rentalAmount(int daysRented);

    public abstract int value();
}
