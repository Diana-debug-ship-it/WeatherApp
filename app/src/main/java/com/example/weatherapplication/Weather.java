package com.example.weatherapplication;

import com.google.gson.annotations.SerializedName;

public class Weather {

    @SerializedName("main")
    private String main;

    @SerializedName("description")
    private String desc;

    public Weather(String main, String desc) {
        this.main = main;
        this.desc = desc;
    }

    public String getMain() {
        return main;
    }

    public String getDesc() {
        return desc;
    }
}
