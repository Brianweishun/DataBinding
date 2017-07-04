/*
 * Copyright (c) 2017 created by Brian_Chen at 6/30/2017.
 */

package com.brian.databinding;

/**
 * Created by Brian_Chen on 30/06/2017.
 */
public class MainActivityPresenter implements MainActivityContract.Presenter{
  private MainActivityContract.View view;

  public MainActivityPresenter(MainActivityContract.View view) {
    this.view = view;
  }

  @Override
  public void onShowData(TemperatureData temperatureData) {
    view.showData(temperatureData);
  }

}
