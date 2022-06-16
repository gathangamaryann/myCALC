package dev.maryann.mycalc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private  lateinit var  btnCalculator : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnCalculator = findViewById(R.id.btnCalculator)
        btnCalculator = findViewById(R.id.btnCalculator)
        btnCalculator.setOnClickListener{
            val intent= Intent(this,Calculate::class.java)
            startActivity(intent)
        }
    }
}