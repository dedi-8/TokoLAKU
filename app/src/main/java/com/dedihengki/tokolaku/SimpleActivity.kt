package com.dedihengki.tokolaku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SimpleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple)

        val btn_back = findViewById<Button>(R.id.btn_back)
        btn_back.setOnClickListener{
            val backIntent = Intent(this@SimpleActivity, MainActivity::class.java)
            startActivity(backIntent)
        }
    }
}