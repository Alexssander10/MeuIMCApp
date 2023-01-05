package com.example.meuimc


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class ImcResultado : AppCompatActivity() {

    private lateinit var textVIMCMessage : TextView
    private lateinit var imageButtonBackImcResultToHome : ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc_resultado)

        supportActionBar?.hide()
        linkedID()
        finalMessage()
        clicks()
    }

    private fun linkedID() {
        textVIMCMessage = findViewById(R.id.txtV_imcResultadoScreen_myIMC)
        imageButtonBackImcResultToHome = findViewById(R.id.imageButtonBackImcResultadoScreen)
    }

    private fun finalMessage(){
        val resultadoIMC : Double = intent.getDoubleExtra("IMC", 0.0)
        val mensagemNaTelaIMC = when {
            resultadoIMC < 18.5 -> "Cuidado, você está abaixo do peso."
            resultadoIMC in 18.5..24.9 -> "Parabéns, você está com seu peso normal."
            resultadoIMC in 25.0..29.9 -> "Atenção! Você está com sobrepeso (acima do peso ideal)."
            resultadoIMC >= 30 -> "Cuidado! Você está com obesidade."
            else -> {"Ops, ocorreu um erro ao calcular seu IMC, tente novamente!"}
        }
        textVIMCMessage.text = mensagemNaTelaIMC
    }

    private fun clicks() {
        imageButtonBackImcResultToHome.setOnClickListener {
            val it = Intent(this, HomeScreen::class.java)
            startActivity(it)
        }
    }
}
