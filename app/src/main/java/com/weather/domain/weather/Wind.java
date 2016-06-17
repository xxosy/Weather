package com.weather.domain.weather;

/**
 * Created by YoungWon on 2016-06-17.
 */

public class Wind {
    double speed;
    double deg;

    public double getDeg() {
        return deg;
    }

    public double getSpeed() {
        return speed;
    }

    public void setDeg(double deg) {
        this.deg = deg;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
