package com.example.calculoimc

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calculoimc.databinding.ActivityResultadoimcBinding

class resultadoimc : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityResultadoimcBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imc = intent.getDoubleExtra("IMC", 0.0)
        binding.resultado.text = String.format("Seu IMC é: %.2f", imc)

        binding.buttonIR.setOnClickListener{
            val intent = Intent(this, tabelaimc::class.java)
            intent.putExtra("IMC", imc)
            startActivity(intent)


        }
        }
    }