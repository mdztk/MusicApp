package com.example.musicapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_MusicApp)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}