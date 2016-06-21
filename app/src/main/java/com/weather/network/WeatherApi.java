package com.weather.network;

import com.weather.domain.weather.WeatherData;

import javax.inject.Inject;

import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by YoungWon on 2016-06-16.
 */

public class WeatherApi {
    private Retrofit retrofit;
    private String appid;

    @Inject
    public WeatherApi(Retrofit retrofit){
        appid = "c3a6ae5ba98a12123a17b8f506e26fe6";
        this.retrofit = retrofit;
    }

    public Observable<WeatherData> getWeatherState(String lat, String lon){
        return retrofit.create(Api.class)
                .getWeatherWithLatLon(lat,lon,appid);
    }

    interface Api {
        @GET("/data/2.5/weather?lat=35.82&lon=127.15&APPID=c3a6ae5ba98a12123a17b8f506e26fe6")
        Observable<WeatherData> getWeather();

        @GET("data/2.5/weather")
        Observable<WeatherData> getWeatherWithLatLon(
                @Query("lat") String lat,
                @Query("lon") String lon,
                @Query("appid") String appid
        );
    }
}
