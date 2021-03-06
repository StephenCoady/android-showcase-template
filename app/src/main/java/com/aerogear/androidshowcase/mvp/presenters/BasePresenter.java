package com.aerogear.androidshowcase.mvp.presenters;

import android.support.annotation.NonNull;

import com.aerogear.androidshowcase.mvp.views.AppView;

/**
 * A base implementation for the presenter interface
 */

public class BasePresenter<VIEW extends AppView> implements Presenter<VIEW> {
    protected VIEW view;

    @Override
    public void attachView(@NonNull VIEW view) {
        this.view = view;
        this.onViewAttached();
    }

    @Override
    public void detachView() {
        this.view = null;
        this.onViewDetached();
    }

    @Override
    public void resume() {

    }

    @Override
    public void pause() {

    }

    protected void onViewAttached() {

    }

    protected  void onViewDetached() {

    }


}
