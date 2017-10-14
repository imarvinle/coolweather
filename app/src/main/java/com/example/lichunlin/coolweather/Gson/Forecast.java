package com.example.lichunlin.coolweather.Gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Lichunlin on 2017/10/14.
 */

public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperature temperature;
    @SerializedName("cond")
    public More more;
    public class  More{
        @SerializedName("txt_d")
        public String info;
    }
    public class Temperature{
        public String max;
        public String min;
    }
}
