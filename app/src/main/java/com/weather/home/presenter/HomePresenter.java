package com.weather.home.presenter;

import com.weather.domain.weather.WeatherData;

import java.util.List;

/**
 * Created by YoungWon on 2016-06-02.
 */

public interface HomePresenter {

    void onItemClick(int position);
    void onEnterActivity();

    interface View {
        void refreshWeatherIcon();
        void refreshRegion(String region);
        void refreshPresentTime(String time);
        void refreshWeeklyWeatherData(List<String> weathers);
        void refreshTest();
    }
}
