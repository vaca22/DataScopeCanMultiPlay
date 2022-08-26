package com.vaca.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    val dataScope = CoroutineScope(Dispatchers.IO)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var gg=0;
        val ga:TextView=findViewById(R.id.ga)

        dataScope.launch {
            delay(1000)
            gg++
        }
        dataScope.launch {
            delay(500)
            gg++
        }

        dataScope.launch {
            delay(1000)
            gg++
            delay(1000)
            delay(1000)
        }

        dataScope.launch {
            delay(1000)
            gg++
        }

        dataScope.launch {
            delay(1000)
            gg++
        }

        dataScope.launch {
            delay(2000)
            withContext(Dispatchers.Main){
                ga.text=gg.toString()
            }
        }


    }
}