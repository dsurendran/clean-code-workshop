package com.movierental;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;
    private PriceCode priceCode;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCodeFor(priceCode);
    }

    private PriceCode priceCodeFor(int priceCode) {
        switch (priceCode){
            case REGULAR:
                return new RegularPriceCode();
            case CHILDRENS:
                return new ChildrenPriceCode();
            case NEW_RELEASE:
                return new NewReleasePriceCode();
            default:
                return new DefaultPriceCode(priceCode);
        }
    }

    public int getPriceCode() {
        return priceCode.value();
    }

    public void setPriceCode(int arg) {
        priceCode = priceCodeFor(arg);
    }

    public String getTitle() {
        return title;
    }

    double rentalAmount(int daysRented) {
        return priceCode.rentalAmount(daysRented);
    }

    boolean isNewReleaseMovie() {
        return getPriceCode() == NEW_RELEASE;
    }

    int frequentRentalPoints(int daysRented) {
        if (isNewReleaseMovie() && daysRented > 1)
            return 2;
        return 1;
    }
}
