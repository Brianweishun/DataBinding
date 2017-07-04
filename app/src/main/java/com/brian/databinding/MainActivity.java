/*
 * Copyright (c) 2017 created by Brian_Chen at 7/4/2017.
 */

package com.brian.databinding;

import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.widget.Toast;
import com.brian.databinding.databinding.ActivityMainBinding;

/**
 * Created by Brian_Chen on 04/07/2017.
 */
public class MainActivity extends Activity implements MainActivityContract.View{
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    MainActivityPresenter mainActivityPresenter = new MainActivityPresenter(this);
    TemperatureData temperatureData = new TemperatureData("Hamburg", "15");
    binding.setTemp(temperatureData);
    binding.setPresenter(mainActivityPresenter);
  }

  @Override
  public void showData(TemperatureData temperatureData) {
    String celsius = temperatureData.getCelsius();
    Toast.makeText(this, celsius, Toast.LENGTH_SHORT).show();
  }


}
