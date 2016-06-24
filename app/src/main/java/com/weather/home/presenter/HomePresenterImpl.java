package com.weather.home.presenter;

import android.util.Log;

import com.weather.domain.weather.WeatherData;
import com.weather.home.adapter.WeatherAdapter;
import com.weather.network.WeatherApi;

import java.util.concurrent.TimeUnit;

import javax.inject.Inject;

import rx.Observable;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subjects.PublishSubject;

/**
 * Created by YoungWon on 2016-06-02.
 */

public class HomePresenterImpl implements HomePresenter {
    private View view;
    private String aa;
    private WeatherApi weatherApi;
    private PublishSubject<String> weatherSubject;
    private Subscription weatherSubscription;
    @Inject
    public HomePresenterImpl(View view, WeatherApi weatherApi, String aa){
        this.view = view;
        this.aa = aa;
        this.weatherApi = weatherApi;
        weatherSubject = PublishSubject.create();
        initSubscription();
    }

    private void initSubscription() {
        weatherSubscription = weatherSubject
                .onBackpressureBuffer()
                .throttleWithTimeout(200, TimeUnit.MILLISECONDS)
                .observeOn(Schedulers.io())
                .subscribe(text -> {

                }, Throwable::printStackTrace);
        weatherApi.getWeatherState("35.82","127.15")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new WeatherAdapter()::set,
                        Throwable::printStackTrace,
                        view::refresh);
    }
    @Override
    public void onItemClick(int position) {

    }

    @Override
    public void onEnterActivity() {

    }
}
