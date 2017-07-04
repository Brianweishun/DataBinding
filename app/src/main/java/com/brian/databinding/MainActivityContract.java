/*
 * Copyright (c) 2017 created by Brian_Chen at 6/30/2017.
 */

package com.brian.databinding;

/**
 * Created by Brian_Chen on 30/06/2017.
 */

public interface MainActivityContract {
  public interface Presenter {
    void onShowData(TemperatureData temperatureData);
  }

  public interface View {
    void showData(TemperatureData temperatureData);
  }
}
