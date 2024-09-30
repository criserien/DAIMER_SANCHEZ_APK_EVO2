package com.arepasrellenas.ui

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.proyecto3.R

class SugerenciaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sugerencia)

        val sugerenciaField: EditText = findViewById(R.id.sugerencia)
        val enviarButton: Button = findViewById(R.id.enviar_button)

        enviarButton.setOnClickListener {
            val sugerencia = sugerenciaField.text.toString()
            if (sugerencia.isNotEmpty()) {
                Toast.makeText(this, "Sugerencia Enviada", Toast.LENGTH_SHORT).show()
                // Aquí puedes implementar el guardado de la sugerencia en una base de datos o enviarla al backend
            } else {
                Toast.makeText(this, "Por favor ingresa una sugerencia", Toast.LENGTH_SHORT).show()
            }
        }
    }
}