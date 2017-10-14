package com.example.lichunlin.coolweather.Gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Lichunlin on 2017/10/14.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
