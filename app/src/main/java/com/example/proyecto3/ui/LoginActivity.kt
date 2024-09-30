package com.arepasrellenas.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.proyecto3.R
import com.example.proyecto3.ui.ProfileActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val usernameField: EditText = findViewById(R.id.username)
        val passwordField: EditText = findViewById(R.id.password)
        val loginButton: Button = findViewById(R.id.login_button)
        val registerButton: Button = findViewById(R.id.register_button)

        loginButton.setOnClickListener {
            val username = usernameField.text.toString()
            val password = passwordField.text.toString()

            // Simulamos una autenticación básica
            if (username == "user" && password == "password") {
                Toast.makeText(this, "Login Exitoso", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, ProfileActivity::class.java))
            } else {
                Toast.makeText(this, "Credenciales Incorrectas", Toast.LENGTH_SHORT).show()
            }
        }

        registerButton.setOnClickListener {
            // Aquí podrías redirigir a una pantalla de registro
        }
    }
}