package com.weather.home.adapter;

import android.content.Context;

import com.weather.domain.weather.WeatherData;

/**
 * Created by YoungWon on 2016-06-24.
 */

public class WeatherAdapter implements  WeatherAdapterModel,WeatherAdapterView{
    private Context context;
    private WeatherData data;

    @Override
    public void set(WeatherData weatherData) {

    }

    @Override
    public WeatherData getData() {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public void refresh() {

    }
}
