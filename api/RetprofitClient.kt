package com.example.weatherapp.api

import com.google.gson.Gson
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetprofitClient {
    var weatherApi: WeatherApi? = null
        get() {
            if (field == null) {
                field = retrofitInstance!!.create(WeatherApi::class.java)
            }
            return field
        }
        private set
    private var retrofit: Retrofit? = null
    private const val BASE_URL = "http://api.openweathermap.org/"
    private val retrofitInstance: Retrofit?
        private get() {
            if (retrofit == null) {
                val client = OkHttpClient().newBuilder().build()
                val gson = Gson()
                retrofit = Retrofit.Builder()
                        .client(client)
                        .baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create(gson))
                        .build()
            }
            return retrofit
        }
}