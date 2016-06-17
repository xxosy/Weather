package com.weather.home.presenter;

import com.weather.domain.weather.WeatherData;
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
    public HomePresenterImpl(View view, String aa){
        this.view = view;
        this.aa = aa;
        weatherSubject = PublishSubject.create();
        initSubscription();
    }

    private void initSubscription() {
        weatherSubscription = weatherSubject
                .onBackpressureBuffer()
                .throttleWithTimeout(200, TimeUnit.MILLISECONDS)
                .observeOn(Schedulers.io())
                .subscribe(text -> {
                    weatherApi.getWeatherState()
                            .observeOn(AndroidSchedulers.mainThread())
                            .subscribe(result-> {WeatherData::setItem(result);},
                                    Throwable::printStackTrace,
                                    view::refreshWeatherIcon);

                }, Throwable::printStackTrace);
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
