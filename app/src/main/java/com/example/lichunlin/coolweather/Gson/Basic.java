package com.example.lichunlin.coolweather.Gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Lichunlin on 2017/10/14.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
