package com.example.aplicacion

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.aplicacion.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //funciòn para no crear el var btnToas = findViewById<Button>(R.id.btnToast)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //no retorna nada
        //setContentView(R.layout.activity_main)
        //var btnToas = findViewById<Button>(R.id.btnToast)

        binding.btnToast.setOnClickListener{
            Toast.makeText(this, "Hola soy un toast", Toast.LENGTH_SHORT).show()
        }

        binding.btnSnackBar.setOnClickListener {
            Snackbar.make(it, "Hola soy un snackbar", Snackbar.LENGTH_LONG)
                .setAction(R.string.texto_cerrar){
                    binding.btnToast.text = "Texto toast manipulado"
                }.setActionTextColor(getColor(R.color.blue)).show()
        }

    }
}