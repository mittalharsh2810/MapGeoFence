package com.harsh.mapgeofence.ui.base;

public interface MvpPresenter<V extends MvpView> {

    void attachView(V mvpView);

    void detachView();

}
