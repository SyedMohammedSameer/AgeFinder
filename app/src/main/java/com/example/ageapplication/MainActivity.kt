package com.example.ageapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.time.Year
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onSubmit(view:View){
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        tvAge.text = "Age ="+(currentYear - inputYear.text.toString().toInt())
    }
}