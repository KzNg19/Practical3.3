package com.example.practical3_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val name = intent.getStringExtra("StudentName")

        val tvResult : TextView = findViewById(R.id.tv_result)
        tvResult.text = name

    }
}