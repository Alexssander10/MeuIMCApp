package com.example.meuimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class NossaHistoria : AppCompatActivity() {

    private lateinit var textViewOurHistory : TextView
    private lateinit var imageButtonBackHistoryToHome : ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nossa_historia)

        supportActionBar?.hide()
        linkedIDs()
        clicks()

        textViewOurHistory.text = buildString {
            append("Bem-vindo ao nosso app de cálculo de IMC!\n")
            append("\n")
            append("Desde o nosso lançamento, temos como missão ajudar pessoas de todo o mundo a manter um peso saudável e atingir seus objetivos de bem-estar.\n")
            append("\n")
            append("Com nosso app fácil de usar, você pode calcular seu Índice de Massa Corporal (IMC) em questão de segundos, acompanhar sua evolução ao longo do tempo e receber dicas e sugestões de exercícios e alimentação saudáveis.\n")
            append("\n")
            append("Acreditamos que a saúde e o bem-estar são fundamentais para uma vida feliz e realizada, e estamos comprometidos em ajudar nossos usuários a alcançar esse objetivo.\n")
            append("\n")
            append("Obrigado por escolher o nosso app! Esperamos que ele seja útil em sua jornada de bem-estar.")
        }

    }

    private fun linkedIDs(){
        textViewOurHistory = findViewById(R.id.textV_OurHistory)
        imageButtonBackHistoryToHome = findViewById(R.id.imageButtonBackOurHistoryScreen)
    }

    private fun clicks() {
        imageButtonBackHistoryToHome.setOnClickListener {
            finish()
        }
    }
}