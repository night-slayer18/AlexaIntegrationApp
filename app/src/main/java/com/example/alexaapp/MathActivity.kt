package com.example.alexaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import android.graphics.Color
import android.os.Handler
import android.view.View
import android.widget.ImageButton
import androidx.constraintlayout.widget.ConstraintLayout
import kotlin.random.Random

class MathActivity : AppCompatActivity() {

    private lateinit var math1 : AppCompatButton
    private lateinit var math2 : AppCompatButton
    private lateinit var math3 : AppCompatButton
    private lateinit var math4 : AppCompatButton
    private lateinit var math5 : AppCompatButton
    private lateinit var math6 : AppCompatButton
    private lateinit var math7 : AppCompatButton
    private lateinit var math8 : AppCompatButton
    private lateinit var math9 : AppCompatButton
    lateinit var problem1 : TextView
    lateinit var problem2 : TextView
    lateinit var operator : TextView
    lateinit var layout1 : ConstraintLayout
    lateinit var layout2 : ConstraintLayout
    lateinit var imageButton : ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_math)

        math1 = findViewById(R.id.m1)
        math2 = findViewById(R.id.m2)
        math3 = findViewById(R.id.m3)
        math4 = findViewById(R.id.m4)
        math5 = findViewById(R.id.m5)
        math6 = findViewById(R.id.m6)
        math7 = findViewById(R.id.m7)
        math8 = findViewById(R.id.m8)
        math9 = findViewById(R.id.m9)
        problem1 = findViewById(R.id.prob1)
        problem2 = findViewById(R.id.prob2)
        operator = findViewById(R.id.operator)
        layout1 = findViewById(R.id.cl3)
        layout2 = findViewById(R.id.cl4)
        imageButton = findViewById(R.id.correct)

        val operators = arrayOf("+", "-", "x")
        val list = listOf(math1,math2,math3,math4,math5,math6,math7,math8,math9)
        val randomOperator = operators.random()
        val (number1, number2) = generateRandomNumbers()
        operator.text = randomOperator
        problem1.text = number1.toString()
        problem2.text = number2.toString()
        val randomVariable = list.random()
        val result = when (randomOperator) {
            "+" -> number1 + number2
            "-" -> number1 - number2
            "x" -> number1 * number2
            else -> throw IllegalArgumentException("Invalid operator: $randomOperator")
        }
        randomVariable.text = result.toString()
        if (!(math1===randomVariable)){
            math1.text = Random.nextInt(-10,100).toString()
        }
        if (!(math2===randomVariable)){
            math2.text = Random.nextInt(-10,100).toString()
        }
        if (!(math3===randomVariable)){
            math3.text = Random.nextInt(-10,100).toString()
        }
        if (!(math4===randomVariable)){
            math4.text = Random.nextInt(-10,100).toString()
        }
        if (!(math5===randomVariable)){
            math5.text = Random.nextInt(-10,100).toString()
        }
        if (!(math6===randomVariable)){
            math6.text = Random.nextInt(-10,100).toString()
        }
        if (!(math7===randomVariable)){
            math7.text = Random.nextInt(-10,100).toString()
        }
        if (!(math8===randomVariable)){
            math8.text = Random.nextInt(-10,100).toString()
        }
        if (!(math9===randomVariable)){
            math9.text = Random.nextInt(-10,100).toString()
        }

        math1.setOnClickListener {
            if (math1===randomVariable){
                layout1.visibility = View.GONE
                layout2.visibility = View.VISIBLE
            }
            else {
                math1.setBackgroundResource(R.drawable.wrong_math)
                math1.setTextColor(Color.WHITE)
                Handler().postDelayed({
                    math1.setBackgroundResource(R.drawable.maths)
                    math1.setTextColor(Color.parseColor("#6A6A6A"))
                }, 2000)
            }
        }
        math2.setOnClickListener {
            if (math2===randomVariable){
                layout1.visibility = View.GONE
                layout2.visibility = View.VISIBLE
            }
            else {
                math2.setBackgroundResource(R.drawable.wrong_math)
                math2.setTextColor(Color.WHITE)
                Handler().postDelayed({
                    math2.setBackgroundResource(R.drawable.maths)
                    math2.setTextColor(Color.parseColor("#6A6A6A"))
                }, 2000)
            }
        }
        math3.setOnClickListener {
            if (math3===randomVariable){
                layout1.visibility = View.GONE
                layout2.visibility = View.VISIBLE
            }
            else {
                math3.setBackgroundResource(R.drawable.wrong_math)
                math3.setTextColor(Color.WHITE)
                Handler().postDelayed({
                    math3.setBackgroundResource(R.drawable.maths)
                    math3.setTextColor(Color.parseColor("#6A6A6A"))
                }, 2000)
            }
        }
        math4.setOnClickListener {
            if (math4===randomVariable){
                layout1.visibility = View.GONE
                layout2.visibility = View.VISIBLE
            }
            else {
                math4.setBackgroundResource(R.drawable.wrong_math)
                math4.setTextColor(Color.WHITE)
                Handler().postDelayed({
                    math4.setBackgroundResource(R.drawable.maths)
                    math4.setTextColor(Color.parseColor("#6A6A6A"))
                }, 2000)
            }
        }
        math5.setOnClickListener {
            if (math5===randomVariable){
                layout1.visibility = View.GONE
                layout2.visibility = View.VISIBLE
            }
            else {
                math5.setBackgroundResource(R.drawable.wrong_math)
                math5.setTextColor(Color.WHITE)
                Handler().postDelayed({
                    math5.setBackgroundResource(R.drawable.maths)
                    math5.setTextColor(Color.parseColor("#6A6A6A"))
                }, 2000)
            }
        }
        math6.setOnClickListener {
            if (math6===randomVariable){
                layout1.visibility = View.GONE
                layout2.visibility = View.VISIBLE
            }
            else {
                math6.setBackgroundResource(R.drawable.wrong_math)
                math6.setTextColor(Color.WHITE)
                Handler().postDelayed({
                    math6.setBackgroundResource(R.drawable.maths)
                    math6.setTextColor(Color.parseColor("#6A6A6A"))
                }, 2000)
            }
        }
        math7.setOnClickListener {
            if (math7===randomVariable){
                layout1.visibility = View.GONE
                layout2.visibility = View.VISIBLE
            }
            else {
                math7.setBackgroundResource(R.drawable.wrong_math)
                math7.setTextColor(Color.WHITE)
                Handler().postDelayed({
                    math7.setBackgroundResource(R.drawable.maths)
                    math7.setTextColor(Color.parseColor("#6A6A6A"))
                }, 2000)
            }
        }
        math8.setOnClickListener {
            if (math8===randomVariable){
                layout1.visibility = View.GONE
                layout2.visibility = View.VISIBLE
            }
            else {
                math8.setBackgroundResource(R.drawable.wrong_math)
                math8.setTextColor(Color.WHITE)
                Handler().postDelayed({
                    math8.setBackgroundResource(R.drawable.maths)
                    math8.setTextColor(Color.parseColor("#6A6A6A"))
                }, 2000)
            }
        }
        math9.setOnClickListener {
            if (math9===randomVariable){
                layout1.visibility = View.GONE
                layout2.visibility = View.VISIBLE
            }
            else {
                math9.setBackgroundResource(R.drawable.wrong_math)
                math9.setTextColor(Color.WHITE)
                Handler().postDelayed({
                    math9.setBackgroundResource(R.drawable.maths)
                    math9.setTextColor(Color.parseColor("#6A6A6A"))
                }, 2000)
            }
        }

        imageButton.setOnClickListener{
            startActivity(Intent(this,MathActivity::class.java))
            overridePendingTransition(0,0)
            finish()
        }
    }

    private fun generateRandomNumbers(): Pair<Int, Int> {
        val randomNumber1 = Random.nextInt(1, 10)
        val randomNumber2 = Random.nextInt(1, 10)
        return randomNumber1 to randomNumber2
    }

    override fun onBackPressed() {
        super.onBackPressed()
        startActivity(Intent(applicationContext,LearnActivity::class.java))
        overridePendingTransition(0,0)
    }
}
