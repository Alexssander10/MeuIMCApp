package com.example.meuimc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast

class CalculadoraIMC : AppCompatActivity() {

    private lateinit var calculadoraIMC : Button
    private lateinit var imageButtonBackToHomeScreen: ImageButton
    private lateinit var pesoEditText : EditText
    private lateinit var alturaEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora_imc)

        supportActionBar?.hide()
        linkedID()
        setClick()
    }

    private fun linkedID(){
        calculadoraIMC = findViewById(R.id.btn_CalcularIMC)
        imageButtonBackToHomeScreen = findViewById(R.id.imageButtonCalcImcScreen_BackToHome)
        alturaEditText = findViewById(R.id.editTxt_Altura)
        pesoEditText = findViewById(R.id.editTxt_Peso)
    }

    private fun setClick(){

        imageButtonBackToHomeScreen.setOnClickListener {
            finish()
        }

        calculadoraIMC.setOnClickListener {
            calculaIMC()
        }
    }

    private fun calculaIMC(){
        val peso = tryParse(pesoEditText.text.toString(), 0.0)
        val altura = tryParse(alturaEditText.text.toString(), 0.0)
        if (peso == 0.0 || altura == 0.0){
            Toast.makeText(this, "Ops, campos inválidos ou vazios, tente novamente", Toast.LENGTH_SHORT).show()
        } else if (peso <= 0 || peso < 20 || peso > 300 || altura <= 0 || altura < 1.0 || altura > 2.50) {
            Toast.makeText(this, "Por favor, insira valores reais!", Toast.LENGTH_SHORT).show()
            } else {
            val imc = peso / (altura * altura)
            val it = Intent(this, ImcResultado::class.java)
            it.putExtra("IMC", imc)
            startActivity(it)
        }
    }

    private fun tryParse(string: String, defaultValue: Double): Double {
        return try {
            string.toDouble()
        } catch (e: NumberFormatException) {
            defaultValue
        }
    }
}