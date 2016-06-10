package com.weather.home.presenter;

import java.util.List;

/**
 * Created by YoungWon on 2016-06-02.
 */

public interface HomePresenter {

    void onItemClick(int position);
    void onEnterView();

    interface View {
        void refreshWeatherIcon();
        void refreshRegion(String region);
        void refreshPresentTime(String time);
        void refreshWeeklyWeatherData(List<String> weathers);
    }
}
