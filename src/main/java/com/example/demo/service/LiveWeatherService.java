package com.example.demo.service;

import com.example.demo.model.CurrentWeather;

public interface LiveWeatherService {
     CurrentWeather getCurrentWeather(String city, String country);
}
