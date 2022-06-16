package dev.maryann.mycalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class Calculate : AppCompatActivity() {
    lateinit var btnAdd: Button
    lateinit var btnSubtract: Button
    lateinit var btnModulus: Button
    lateinit var btnDivision: Button
    lateinit var tillNumone: TextInputLayout
    lateinit var tillNumtwo: TextInputLayout
    lateinit var etNum1: EditText
    lateinit var etNum2: EditText
    lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculate)
        btnAdd = findViewById(R.id.btnAdd)
        btnSubtract = findViewById(R.id.btnSubtract)
        btnModulus = findViewById(R.id.btnModulus)
        btnDivision= findViewById(R.id.btnDivision)
        tillNumone=findViewById(R.id.tilNumone)
        tillNumtwo=findViewById(R.id.tilNumtwo)
        etNum1=findViewById(R.id.etNumone)
        etNum2=findViewById(R.id.etNumtwo)
        tvResult = findViewById(R.id.tvResult)

        btnAdd.setOnClickListener {
            val num1= etNum1.text.toString()
            val num2 = etNum2.text.toString()
            if(num1.isBlank()){
                etNum1.setError("number is required")
                return@setOnClickListener
            }
            if(num2.isBlank()){
                etNum2.setError("number is required ")
                return@setOnClickListener
            }
            addition(num1.toInt(), num2.toInt())

        }

        btnSubtract.setOnClickListener {
            val num1= etNum1.text.toString()
            val num2 = etNum2.text.toString()
            if(num1.isBlank()){
                etNum1.setError("number is required")
                return@setOnClickListener
            }
            if(num2.isBlank()){
                etNum2.setError("number is required ")
                return@setOnClickListener
            }
            subtract(num1.toInt(), num2.toInt())


        }
        btnModulus.setOnClickListener {
            val num1= etNum1.text.toString()
            val num2 = etNum2.text.toString()
            if(num1.isBlank()){
                etNum1.setError("number is required")
                return@setOnClickListener
            }
            if(num2.isBlank()){
                etNum2.setError("number is required ")
                return@setOnClickListener
            }

            modulus(num1.toInt(), num2.toInt())



        }
        btnDivision.setOnClickListener {
            val num1= etNum1.text.toString()
            val num2 = etNum2.text.toString()
            if(num1.isBlank()){
                etNum1.setError("number is required")
                return@setOnClickListener
            }
            if(num2.isBlank()){
                etNum2.setError("number is required ")
                return@setOnClickListener
            }
            Division(num1.toInt(), num2.toInt())

        }


    }
    fun addition(num1:Int, num2:Int){
        val add=num1+num2
        tvResult.text=add.toString()
    }
    fun subtract(num1:Int, num2:Int){
        val subtract=num1-num2
        tvResult.text=subtract.toString()
    }
    fun Division(num1:Int, num2:Int){
        val Division=num1/num2
        tvResult.text=Division.toString()
    }
    fun modulus(num1:Int, num2:Int){
        val modulus=num1%num2
        tvResult.text=modulus.toString()
    }
}


