package com.example.weatherapplication;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WeatherResponse {

    @SerializedName("weather")
    private List<Weather> weather;

    @SerializedName("name")
    private String city;

    public WeatherResponse(List<Weather> weather, String city) {
        this.weather = weather;
        this.city = city;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public String getCity() {
        return city;
    }
}
