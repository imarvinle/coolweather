package com.example.lichunlin.coolweather.Gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Lichunlin on 2017/10/14.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
