package com.weather.domain.weather;

/**
 * Created by YoungWon on 2016-06-17.
 */

public class Sys {
    double message;
    String country;
    long sunrise;
    long senset;

    public double getMessage() {
        return message;
    }

    public long getSenset() {
        return senset;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setMessage(double message) {
        this.message = message;
    }
}
