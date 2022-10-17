package com.example.app_rospatent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashScreen : AppCompatActivity() {

    private val handler = Handler(Looper.getMainLooper())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen)

        handler.postDelayed(time,2000)

    }

    private val time:Runnable = Runnable {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}