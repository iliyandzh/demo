package com.example.demo.controller;

import com.example.demo.service.LiveWeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NavigationController {

    private final LiveWeatherService liveWeatherService;

    @Autowired
    public NavigationController(LiveWeatherService liveWeatherService){

        this.liveWeatherService = liveWeatherService;
    }

    @RequestMapping(value = "/{city}", method = RequestMethod.GET)
    public String getCurrentWeatherForSofia(@PathVariable("city") String city,  Model model){
        model.addAttribute("currentWeather", liveWeatherService.getCurrentWeather(city,"Bulgaria"));
        return "current-weather.html";
    }

}
