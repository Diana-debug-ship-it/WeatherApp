package com.example.weatherapplication;

import com.google.gson.annotations.SerializedName;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    @GET("weather?appid=59ceaa867e0d645114ff07c8074c570d")
    Single<WeatherResponse> loadWeatherResponse(@Query("lat") double lat, @Query("lon") double lon);
}
