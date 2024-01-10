package com.example.sorteio_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sortearNumero(view: View) {

        var texto = findViewById<TextView>(R.id.numsort)
        var numsorteado = java.util.Random().nextInt(101)
        texto.text = "O numero sorteado é :" + numsorteado

    }
}