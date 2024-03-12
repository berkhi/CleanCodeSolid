package com.berkhayta._01_Solid._05_DIP._01_DIP_Aykiri;

public class WeatherServiceClient {
    private IWeatherService weatherService;

    public WeatherServiceClient(IWeatherService weatherService) {
        this.weatherService = weatherService;
    }

    public void displayWeather(){
        System.out.println("Şu an ki hava durumu: " + weatherService.getWeather());
    }
}
