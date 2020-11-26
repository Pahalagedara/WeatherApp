package com.example.weatherapp

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.weatherapp.api.RetprofitClient
import com.example.weatherapp.api.model.WeatherApiResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity2 : AppCompatActivity() {

    private val city = "Maho"
    private var tvTemp: TextView? = null
    private var tvFeelLike: TextView? = null
    private var tvTempMin: TextView? = null
    private var tvTempMax: TextView? = null
    private var tvHumidity: TextView? = null
    private var tvPressure: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {

        tvTemp = findViewById(R.id.tvTemp)
        tvFeelLike = findViewById(R.id.tvFeelsLike)
        tvTempMin = findViewById(R.id.tvTempMin)
        tvTempMax = findViewById(R.id.tvTempMax)
        tvHumidity = findViewById(R.id.tvHumidity)
        tvPressure = findViewById(R.id.tvPressure)


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        RetprofitClient.weatherApi.getWeatherDataAt(city)?.enqueue(object : Callback<WeatherApiResponse?> {
            override fun onResponse(call: Call<WeatherApiResponse?>, response: Response<WeatherApiResponse?>) {
                val weatherApiResponse = response.body()
                println(weatherApiResponse)
                
                tvTemp.setText(weatherApiResponse!!.main.temp.toString())
                tvFeelLike.setText(weatherApiResponse.main.feels_like.toString())
                tvTempMin.setText(weatherApiResponse.main.temp_min.toString())
                tvTempMax.setText(weatherApiResponse.main.temp_max.toString())
                tvHumidity.setText(weatherApiResponse.main.humidity.toString())
                tvPressure.setText(weatherApiResponse.main.pressure.toString())
            }

            override fun onFailure(call: Call<WeatherApiResponse?>, t: Throwable) {
                println("error")
            }
        })
    }
}