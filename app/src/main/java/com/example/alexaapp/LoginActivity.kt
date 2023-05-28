package com.example.alexaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class LoginActivity : AppCompatActivity() {

    lateinit var login : AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        login = findViewById(R.id.log)

        login.setOnClickListener {
            startActivity(Intent(application,OptionsActivity::class.java))
            overridePendingTransition(0,0)
            finish()
        }
    }
    
}

