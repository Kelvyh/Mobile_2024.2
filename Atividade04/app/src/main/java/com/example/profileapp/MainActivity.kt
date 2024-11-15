package com.example.profileapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val nameTextView = findViewById<TextView>(R.id.nameText)
        nameTextView.text = getString(R.string.nome)

        val profileImageView = findViewById<ImageView>(R.id.profileImage)
        profileImageView.setImageResource(R.drawable.foto)
        profileImageView.setOnClickListener {
            Toast.makeText(this, "foto de perfil de ${nameTextView.text}!", Toast.LENGTH_SHORT).show()
        }

        val descriptionTextView = findViewById<TextView>(R.id.descriptionText)
        descriptionTextView.text = getString(R.string.descricao)

        val currentJobTextView = findViewById<TextView>(R.id.currentJobText)
        currentJobTextView.text = getString(R.string.emprego)

        val experienceLayout = findViewById<LinearLayout>(R.id.experienceLayout)

        // Lista de experiências (exemplo)
        val experiences = listOf("Bolsista BIA em Ciência de Dados", "Bolsista PID em Matemática Básica e Discreta",
            "Estágio em Desenvolvimento Web Full Stack",
            "Estagio em Product Design")

        // Adicionar dinamicamente TextViews para cada experiência
        experiences.forEach { experience ->
            val experienceTextView = TextView(this).apply {
                text = experience
                textSize = 16f // Tamanho do texto
                setPadding(16, 8, 0, 8) // Espaçamento
            }
            experienceLayout.addView(experienceTextView)
        }
    }
}