package com.example.calculoimc

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calculoimc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonOk.setOnClickListener {
            val peso = binding.editTextpeso.text.toString().toDoubleOrNull()
            val altura = binding.editTextaltura.text.toString().toDoubleOrNull()

            if (peso != null && altura != null) {
                val imc = calcularIMC(peso, altura)
                val intent = Intent(this, resultadoimc:: class.java)
                intent.putExtra("IMC", imc)
                startActivity(intent)
            } else {
                val intent = Intent(this, resultadoimc:: class.java)
                intent.putExtra("IMC", 0.0)
                startActivity(intent)
            }
        }
    }
    private fun calcularIMC(peso: Double, altura: Double): Double{
        return peso / (altura*altura)
    }
}