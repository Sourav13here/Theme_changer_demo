package com.example.theme

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dark= findViewById<Button>(R.id.btnDark)
        val light= findViewById<Button>(R.id.btnLight)
        val layout= findViewById<LinearLayout>(R.id.btnLayout)
        light.setOnClickListener{
            layout.setBackgroundResource(R.color.yellow)
            Toast.makeText(applicationContext,"Light colour activated ",Toast.LENGTH_SHORT).show()
        }
            dark.setOnClickListener{
                layout.setBackgroundResource(R.color.black)
                Toast.makeText(applicationContext,"Dark colour activated ",Toast.LENGTH_SHORT).show()
        }
        }

    }
