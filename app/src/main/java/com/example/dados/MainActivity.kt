package com.example.dados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.dados.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var b: ActivityMainBinding

     private val dados = arrayOf(R.drawable.dice1, R.drawable.dice2, R.drawable.dice3, R.drawable.dice4, R.drawable.dice5, R.drawable.dice6 )


//     val s2 = Random.nextInt(1,7)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)
    }

    fun clickOnDado (view:View) {
        val d1 = Random.nextInt(1,7)
        val d2 = Random.nextInt(1,7)
        b.dado1.setImageResource(dados [d1-1])
        b.dado2.setImageResource(dados[d2-1])
        b.textView.text= (d1+d2).toString()
    }



























}

//    fun random1 (View:View) {
//
//        val s = Random.nextInt(1,7)
//        val imgresource = when (s) {
//            1 -> R.drawable.dice1
//            2 -> R.drawable.dice2
//            3 -> R.drawable.dice3
//            4 -> R.drawable.dice4
//            5 -> R.drawable.dice5
//            else -> R.drawable.dice6
//        }
//
//        b.dado1.setImageResource(imgresource)
//        b.textView.text = (s+s2).toString()
//
//
//
//
//    }
//
//    fun ramdon2 (view:View) {
//
//        val imgresource2 = when (s2) {
//            1 -> R.drawable.dice1
//            2 -> R.drawable.dice2
//            3 -> R.drawable.dice3
//            4 -> R.drawable.dice4
//            5 -> R.drawable.dice5
//            else -> R.drawable.dice6
//        }
//        b.dado2.setImageResource(imgresource2)
//    }
//
//
//















