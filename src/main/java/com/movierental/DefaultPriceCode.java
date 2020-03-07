package com.movierental;

public class DefaultPriceCode extends PriceCode {
    private int priceCode;

    public DefaultPriceCode(int priceCode) {
        this.priceCode = priceCode;
    }

    @Override
    public double rentalAmount(int daysRented) {
        return 0;
    }

    @Override
    public int value() {
        return priceCode;
    }
}
