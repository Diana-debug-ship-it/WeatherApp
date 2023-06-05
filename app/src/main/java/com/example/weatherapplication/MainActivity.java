package com.example.weatherapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.location.Address;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private MainViewModel viewModel;

    private TextView textViewCity;
    private TextView textViewWeather;
    private TextView textViewDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewModel = new ViewModelProvider(this).get(MainViewModel.class);
        initViews();
        viewModel.loadWeather();
        viewModel.getResponse().observe(this, new Observer<WeatherResponse>() {
            @Override
            public void onChanged(WeatherResponse weatherResponse) {
                textViewCity.setText(String.format(getResources().getString(R.string.str_your_city),
                        weatherResponse.getCity()));
                textViewWeather.setText(String.format(getResources().getString(R.string.str_weather),
                        weatherResponse.getWeather().get(0).getMain()));
                textViewDescription.setText(String.format(getResources().getString(R.string.str_description),
                        weatherResponse.getWeather().get(0).getDesc()));
            }
        });
    }

    private void initViews(){
        textViewCity = findViewById(R.id.textViewCity);
        textViewWeather = findViewById(R.id.textViewWeather);
        textViewDescription = findViewById(R.id.textViewDescription);
    }
}