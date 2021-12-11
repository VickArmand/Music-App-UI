package com.example.musicapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.musicapp.databinding.ActivitySongviewBinding

class Songview : AppCompatActivity() {
    lateinit var binding: ActivitySongviewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySongviewBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_songview)
    }
}