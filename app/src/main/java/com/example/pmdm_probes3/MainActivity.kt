package com.example.pmdm_probes3

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnEnviar = findViewById<Button>(R.id.button)

        btnEnviar.setOnClickListener{
            Log.i("Etiqueta","Se ha enviado")

            val textoEdit = findViewById<TextView>(R.id.usuario)
            val textito = textoEdit.text.toString()

            Log.i("Etiqueta",textito)


            if (textito.isNotEmpty()){
                val intento = Intent(this, ResultadoActivity::class.java )
                intento.putExtra("EXTRA_NAME",textito)
                startActivity(intento)
            }

        }
    }
}