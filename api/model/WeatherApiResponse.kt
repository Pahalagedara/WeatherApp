package com.example.weatherapp.api.model

class WeatherApiResponse {
    var main: WeatherData? = null

    constructor() {}
    constructor(main: WeatherData?) {
        this.main = main
    }

    override fun toString(): String {
        return "WeatherApiResponse{" +
                "main=" + main +
                '}'
    }
}