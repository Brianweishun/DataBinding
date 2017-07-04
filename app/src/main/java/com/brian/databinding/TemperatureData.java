/*
 * Copyright (c) 2017 created by Brian_Chen at 6/30/2017.
 */

package com.brian.databinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by Brian_Chen on 30/06/2017.
 */

public class TemperatureData extends BaseObservable {
    private String location;
    private String celsius;

    public TemperatureData(String location, String celsius) {
        this.location = location;
        this.celsius = celsius;
    }

    public String getCelsius() {
        return celsius;
    }

    public void setCelsius(String celsius) {
        this.celsius = celsius;
        notifyPropertyChanged(BR.temp);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
        notifyPropertyChanged(BR.presenter);
    }
}
