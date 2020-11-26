package com.example.weatherapp.api.model

class WeatherData {
    var temp = 0.0
    var feels_like = 0.0
    var temp_min = 0.0
    var temp_max = 0.0
    var pressure = 0.0
    var humidity = 0.0

    constructor() {}
    constructor(temp: Double, feels_like: Double, temp_min: Double, temp_max: Double, pressure: Double, humidity: Double) {
        this.temp = temp
        this.feels_like = feels_like
        this.temp_min = temp_min
        this.temp_max = temp_max
        this.pressure = pressure
        this.humidity = humidity
    }

    override fun toString(): String {
        return "WeatherData{" +
                "temp=" + temp +
                ", feels_like=" + feels_like +
                ", temp_min=" + temp_min +
                ", temp_max=" + temp_max +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                '}'
    }
}