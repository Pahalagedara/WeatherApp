package com.example.weatherapp.api

import com.example.weatherapp.api.model.WeatherApiResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {
    @GET("data/2.5/weather?appid=1475edad1aafefe9fec28d268ff68b56")
    fun getWeatherDataAt(@Query("q") city: String?): Call<WeatherApiResponse?>?
}