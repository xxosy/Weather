package com.weather.domain.weather;

import android.util.Log;

/**
 * Created by YoungWon on 2016-06-17.
 */

public class WeatherData {
    static WeatherData item;
    Coord coord;
    Weather weather[];
    String base;
    Main main;
    Wind wind;
    Clouds clouds;
    long dt;
    Sys sys;
    long id;
    String name;
    int cod;

    public static WeatherData getItem() {
        if(item==null)
            item = new WeatherData();
        return item;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public Coord getCoord() {
        return coord;
    }

    public int getCod() {
        return cod;
    }

    public long getDt() {
        return dt;
    }

    public long getId() {
        return id;
    }

    public Main getMain() {
        return main;
    }

    public String getBase() {
        return base;
    }

    public String getName() {
        return name;
    }

    public Sys getSys() {
        return sys;
    }

    public Weather[] getWeather() {
        return weather;
    }

    public Wind getWind() {
        return wind;
    }

    public void setItem(WeatherData item) {
        this.item = item;
        Log.i("test","test2");
    }

    public void setBase(String base) {
        this.base = base;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public void setDt(long dt) {
        this.dt = dt;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public void setWeather(Weather[] weather) {
        this.weather = weather;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }
}
