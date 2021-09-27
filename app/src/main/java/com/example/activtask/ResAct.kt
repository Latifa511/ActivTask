package com.example.activtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_row)

        var intent2 = intent.extras?.get("test")
        var tvTxt2 = findViewById<TextView>(R.id.tvTxt2)
        tvTxt2.text = intent2.toString()
    }

}