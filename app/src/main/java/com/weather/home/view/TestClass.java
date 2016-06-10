package com.weather.home.view;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by YoungWon on 2016-06-02.
 */

public class TestClass implements Test1{

    @Inject
    public TestClass(){
        Log.i("zz","zz");
    }
}
