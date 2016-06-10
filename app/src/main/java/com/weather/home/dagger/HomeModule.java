package com.weather.home.dagger;



import com.weather.home.presenter.HomePresenter;
import com.weather.home.presenter.HomePresenterImpl;
import com.weather.home.view.Test1;
import com.weather.home.view.TestClass;
import com.weather.network.dagger.NetworkModule;

import dagger.Module;
import dagger.Provides;

/**
 * Created by YoungWon on 2016-06-02.
 */
@Module(includes = NetworkModule.class)
public class HomeModule {
    private HomePresenter.View view;
    private String aa;

    public HomeModule(HomePresenter.View view,String aa){
        this.view = view;
        this.aa = aa;
    }
    @Provides
    String provideAa(){
        return aa;
    }
    @Provides
    HomePresenter provideHomePresenter(HomePresenterImpl homePresenter) {
        return homePresenter;
    }

    @Provides
    HomePresenter.View provideView() {
        return view;
    }

    @Provides
    Test1 provideTest1(TestClass testClass){
        return testClass;
    }
}