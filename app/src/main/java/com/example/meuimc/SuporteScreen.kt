package com.example.meuimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class SuporteScreen : AppCompatActivity() {

    private lateinit var imageButtonBackToHomeScreen : ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_suporte_screen)

        supportActionBar?.hide()
        linkedID()
        setClicks()

    }

    private fun linkedID() {
        imageButtonBackToHomeScreen = findViewById(R.id.imageButtonSuportScreen_BackToHome)

    }

    private fun setClicks() {
        imageButtonBackToHomeScreen.setOnClickListener{
            finish()
        }
    }
}