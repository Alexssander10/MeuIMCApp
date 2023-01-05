package com.example.meuimc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomeScreen : AppCompatActivity() {

    private lateinit var buttonHomeScreen : Button
    private lateinit var speakToUs: TextView
    private lateinit var ourHistory: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)

        supportActionBar?.hide()
        linkedID()
        setClick()
    }

    private fun linkedID(){
        buttonHomeScreen = findViewById(R.id.btn_HomeScreen)
        speakToUs = findViewById(R.id.txtV_FaleConosco_HomeScreen)
        ourHistory = findViewById(R.id.txtV_QuemSomos_HomeScreen)
    }

    private fun setClick(){

        buttonHomeScreen.setOnClickListener{
            val it = Intent (this, CalculadoraIMC::class.java)
            startActivity(it)
        }

        speakToUs.setOnClickListener{
            val it = Intent (this, SuporteScreen::class.java)
            startActivity(it)
        }

        ourHistory.setOnClickListener{
            val it = Intent (this, NossaHistoria::class.java)
            startActivity(it)
        }
    }

}