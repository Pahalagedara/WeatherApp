package com.example.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.os.Bundle
import com.example.weatherapp.R
import android.content.Intent
import com.example.weatherapp.MainActivity2
import java.util.*

class MainActivity : AppCompatActivity() {
    var timer: Timer? = null
    private var sample: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sample = findViewById(R.id.sample)
        timer = Timer()
        timer!!.schedule(object : TimerTask() {
            override fun run() {
                val intent = Intent(applicationContext, MainActivity2::class.java)
                startActivity(intent)
            }
        }, 1000)
    }
}