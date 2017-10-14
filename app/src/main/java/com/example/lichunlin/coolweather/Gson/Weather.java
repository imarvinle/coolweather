package com.example.lichunlin.coolweather.Gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Lichunlin on 2017/10/14.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
