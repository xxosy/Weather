package com.weather.network.dagger;

import com.weather.network.retrofit.RetrofitCreator;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class NetworkModule {
    @Provides
    public Retrofit provideRetrofit() {
        return RetrofitCreator.createRetrofit();
    }

}
