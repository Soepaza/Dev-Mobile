package com.example.firstapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.firstapp.databinding.ActivityMainBinding
import com.example.firstapp.databinding.ActivitySegundaTelaBinding


class SegundaTela : AppCompatActivity() {

    private lateinit var binding: ActivitySegundaTelaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySegundaTelaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.icNavegar.setOnClickListener{
            val voltarprimeiratela = Intent(this, MainActivity:: class.java)
            startActivity(voltarprimeiratela)
        }
    }
}