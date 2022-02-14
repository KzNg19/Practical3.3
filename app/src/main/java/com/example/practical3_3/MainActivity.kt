package com.example.practical3_3

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnA: Button = findViewById(R.id.btn_a)

        btnA.setOnClickListener() {
            val intentA: Intent = Intent(
                this,
                AboutActivity::class.java
            )
            intentA.putExtra("StudentName","kz")

            startActivity(intentA)
        }

        val btnB: Button = findViewById(R.id.btn_b)
        btnB.setOnClickListener(){
            /*val telNo = Uri.parse("tel:999")
            val intentA: Intent = Intent(Intent.ACTION_DIAL,telNo)*/
            val geo = Uri.parse("geo: 3.140853, 101.693207")
            val intentA: Intent = Intent(Intent.ACTION_VIEW ,geo)
            startActivity(intentA)
        }   
    }
}