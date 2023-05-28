package com.example.alexaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class OptionsActivity : AppCompatActivity() {

    lateinit var learn : AppCompatButton
    lateinit var chat : AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_options)

        learn = findViewById(R.id.learnbutton)
        chat = findViewById(R.id.chatbutton)

        learn.setOnClickListener {
            startActivity(Intent(applicationContext,LearnActivity::class.java))
            overridePendingTransition(0,0)
        }
    }


}