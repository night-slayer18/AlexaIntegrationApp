package com.example.alexaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class LearnActivity : AppCompatActivity() {

    lateinit var math : AppCompatButton
    lateinit var type : AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn)

        math = findViewById(R.id.math)
        type = findViewById(R.id.typing)

        math.setOnClickListener {
            startActivity(Intent(application,MathActivity::class.java))
            overridePendingTransition(0,0)
        }

        type.setOnClickListener {
            startActivity(Intent(applicationContext,TypingActivity::class.java))
            overridePendingTransition(0,0)
        }
    }
}