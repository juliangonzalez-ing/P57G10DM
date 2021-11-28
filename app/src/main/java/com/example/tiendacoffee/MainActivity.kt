package com.example.tiendacoffee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: android.view.View) {
       // var botonregistro=view.findViewById<Button>(R.id.btnRegistro)
        Toast.makeText(this, "Lo sentimos, estamos trabajando ", Toast.LENGTH_SHORT).show()

    }
}