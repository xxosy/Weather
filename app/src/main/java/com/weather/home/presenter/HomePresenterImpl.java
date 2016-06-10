package com.weather.home.presenter;

import android.widget.Toast;

import com.weather.home.view.Test1;

import javax.inject.Inject;

/**
 * Created by YoungWon on 2016-06-02.
 */

public class HomePresenterImpl implements HomePresenter {
    private View view;
    private String aa;
    private Test1 test1;
    @Inject
    public HomePresenterImpl(View view, Test1 test1, String aa){
        this.view = view;
        this.aa = aa;
        this.test1 = test1;
    }
    @Override
    public void onItemClick(int position) {
        view.test();
    }
}
