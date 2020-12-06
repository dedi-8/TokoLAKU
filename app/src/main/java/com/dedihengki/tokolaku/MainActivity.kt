package com.dedihengki.tokolaku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_simple_intent = findViewById<Button>(R.id.btn_simple_intent)
        val btn_intent_with_data = findViewById<Button>(R.id.btn_intent_with_data)
        val btn_intent_parcalable = findViewById<Button>(R.id.btn_intent_parcalable)
        val btn_implicit_intent = findViewById<Button>(R.id.btn_implicit_intent)
        val btn_intent_result = findViewById<Button>(R.id.btn_intent_result)

        btn_simple_intent.setOnClickListener{
            val simpleIntent = Intent(this@MainActivity, SimpleActivity::class.java)
            startActivity(simpleIntent)
        }
    }
}