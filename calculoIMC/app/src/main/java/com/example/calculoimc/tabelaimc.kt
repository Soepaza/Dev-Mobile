package com.example.calculoimc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.calculoimc.databinding.ActivityTabelaimcBinding

class tabelaimc : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityTabelaimcBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imc = intent.getDoubleExtra("IMC", 0.0)

        val mensagem = when {
            imc < 16 -> "super magro"
            imc >= 16 && imc < 17 -> "muito magro"
            imc >= 17 && imc < 18.5 -> "abaixo do peso"
            imc >= 18.5 && imc < 25 -> "com peso normal"
            imc >= 25 && imc < 30 -> "com sobrepeso"
            imc >= 30 && imc < 35 -> "obeso"
            else -> "com obesidade mórbida"
        }

        val mensagemCompleta = "De acordo com seu IMC de %.2f, você está %s.".format(imc, mensagem)
        binding.imcMessageTextView.text = mensagemCompleta

    }
}
