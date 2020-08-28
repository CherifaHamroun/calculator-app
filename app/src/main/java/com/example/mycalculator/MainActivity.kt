package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var lastNumeric = false
    var lastDot = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onDigit(view : View){
        tvInput.append((view as Button).text)
        lastNumeric = true
    }
    fun onClear(view : View){
        tvInput.text = ""
        lastNumeric = false
        lastDot = false
    }
    fun onDecimal(view : View){
        if (lastNumeric && !lastDot){
            tvInput.append(".")
            lastNumeric = false
            lastDot = true
        }
    }
}