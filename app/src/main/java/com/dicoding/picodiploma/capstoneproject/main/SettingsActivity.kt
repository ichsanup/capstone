package com.dicoding.picodiploma.capstoneproject.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import com.dicoding.picodiploma.capstoneproject.databinding.ActivitySettingsBinding

class SettingsActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySettingsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupBackground()
        setupHome()
        setupLanguage()
    }

    private fun setupLanguage() {
        binding.btnLanguage.setOnClickListener {
            startActivity(Intent(Settings.ACTION_LOCALE_SETTINGS))
        }
    }

    private fun setupHome() {
        binding.home.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }

    private fun setupBackground() {
        binding.btnAboutus.setOnClickListener {
            startActivity(Intent(this, BackgroundActivity::class.java))
        }
    }
}