package com.weather.home.dagger;


import com.weather.home.view.HomeActivity;

import dagger.Component;

@Component(modules = HomeModule.class)
public interface HomeComponent {
    void inject(HomeActivity homeActivity);
}
