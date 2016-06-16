package com.weather.network;

import com.weather.domain.weather.Weather;

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

    public Observable<Weather> getWeatherState(){
        return retrofit.create(Api.class)
                .getWeather();
    }

    interface Api {
        @GET("")
        Observable<Weather> getWeather();
    }
}
