package com.weather.home.adapter;

import com.weather.domain.weather.WeatherData;

/**
 * Created by YoungWon on 2016-06-24.
 */

public interface WeatherAdapterModel {
    void set(WeatherData weatherData);
    WeatherData getData();
    void clear();
}
