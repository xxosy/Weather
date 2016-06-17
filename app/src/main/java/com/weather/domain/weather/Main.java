package com.weather.domain.weather;

/**
 * Created by YoungWon on 2016-06-17.
 */

public class Main {
    double temp;
    double pressure;
    double humidity;
    double temp_min;
    double temp_max;
    double see_level;
    double grand_level;

    public double getGrand_level() {
        return grand_level;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public double getSee_level() {
        return see_level;
    }

    public double getTemp() {
        return temp;
    }

    public double getTemp_max() {
        return temp_max;
    }

    public double getTemp_min() {
        return temp_min;
    }

    public void setGrand_level(double grand_level) {
        this.grand_level = grand_level;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public void setSee_level(double see_level) {
        this.see_level = see_level;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public void setTemp_max(double temp_max) {
        this.temp_max = temp_max;
    }

    public void setTemp_min(double temp_min) {
        this.temp_min = temp_min;
    }
}
