package com.weather.domain.weather;

/**
 * Created by YoungWon on 2016-06-17.
 */

public class Coord {
    private double lon;
    private double lat;

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }
}
