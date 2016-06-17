package com.weather.network;

import com.weather.domain.weather.WeatherData;

import javax.inject.Inject;

import retrofit2.Retrofit;
import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by YoungWon on 2016-06-16.
 */

public class WeatherApi {
    private Retrofit retrofit;

    @Inject
    public WeatherApi(Retrofit retrofit){
        this.retrofit = retrofit;
    }

    public Observable<WeatherData> getWeatherState(){
        return retrofit.create(Api.class)
                .getWeather();
    }

    interface Api {
        @GET("/data/2.5/weather?lat=35.82&lon=127.15&APPID=c3a6ae5ba98a12123a17b8f506e26fe6")
        Observable<WeatherData> getWeather();
    }
}
