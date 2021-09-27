package com.example.activtask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import java.time.Instant

class MainActivity : AppCompatActivity() {

    lateinit var clayout: ConstraintLayout
    lateinit var edName1: EditText
    lateinit var edLocation1: EditText
    lateinit var edMobile1: EditText
    lateinit var toabtn1: Button
    lateinit var tvbtn1: Button
    lateinit var gobtn1: Button
    lateinit var tvTxt1: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clayout = findViewById(R.id.cl)
        edName1 = findViewById(R.id.edName)
        edLocation1 = findViewById(R.id.edLocation)
        edMobile1 = findViewById(R.id.edMobile)
        toabtn1 = findViewById(R.id.toabtn)
        tvbtn1 = findViewById(R.id.tvbtn)
        gobtn1 = findViewById(R.id.gobtn)

        tvTxt1 = findViewById(R.id.tvTxt)

        val list = listOf(edName1.text,edLocation1.text,edMobile1.text)

        toabtn1.setOnClickListener {
            Toast.makeText(applicationContext,list.shuffled().take(3).toString(),Toast.LENGTH_SHORT).show()

        }
        gobtn1.setOnClickListener {
            val intent = Intent(this,ResAct::class.java)
            intent.putExtra("test",list.take(3).toString())
            startActivity(intent)
        }
        tvbtn1.setOnClickListener {
            tvTxt1.text = list.toString()
        }


    }
}