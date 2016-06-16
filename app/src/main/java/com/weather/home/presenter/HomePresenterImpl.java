package com.weather.home.presenter;

import javax.inject.Inject;

/**
 * Created by YoungWon on 2016-06-02.
 */

public class HomePresenterImpl implements HomePresenter {
    private View view;
    private String aa;
    @Inject
    public HomePresenterImpl(View view, String aa){
        this.view = view;
        this.aa = aa;
    }
    @Override
    public void onItemClick(int position) {

    }

    @Override
    public void onEnterActivity() {

    }
    private void getWeatherData(){

    }
}
