package com.example.maytinh

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private lateinit var textview2: TextView
    private var var1 = ""
    private var var2 = ""
    private var method = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textview2 = findViewById(R.id.textview2)
        setup()
    }

    private fun setup() {

        val num1 = findViewById<Button>(R.id.num1)
        num1.setOnClickListener {
            val oldValue = textview2.text.toString()
            val newValue = oldValue + "1"
            textview2.text = newValue
            if(method == "") {
                var1 += "1"
            } else {
                var2 += "1"
            }
        }
        val num2 = findViewById<Button>(R.id.num2)
        num2.setOnClickListener {
            val oldValue = textview2.text.toString()
            val newValue = oldValue + "2"
            textview2.text = newValue
            if(method == "") {
                var1 += "2"
            } else {
                var2 += "2"
            }
        }
        val num3 = findViewById<Button>(R.id.num3)
        num3.setOnClickListener {
            val oldValue = textview2.text.toString()
            val newValue = oldValue + "3"
            textview2.text = newValue
            if(method == "") {
                var1 += "3"
            } else {
                var2 += "3"
            }
        }
        val num4 = findViewById<Button>(R.id.num4)
        num4.setOnClickListener {
            val oldValue = textview2.text.toString()
            val newValue = oldValue + "4"
            textview2.text = newValue
            if(method == "") {
                var1 += "4"
            } else {
                var2 += "4"
            }
        }
        val num5 = findViewById<Button>(R.id.num5)
        num5.setOnClickListener {
            val oldValue = textview2.text.toString()
            val newValue = oldValue + "5"
            textview2.text = newValue
            if(method == "") {
                var1 += "5"
            } else {
                var2 += "5"
            }
        }
        val num6 = findViewById<Button>(R.id.num6)
        num6.setOnClickListener {
            val oldValue = textview2.text.toString()
            val newValue = oldValue + "6"
            textview2.text = newValue
            if(method == "") {
                var1 += "6"
            } else {
                var2 += "6"
            }
        }
        val num7 = findViewById<Button>(R.id.num7)
        num7.setOnClickListener {
            val oldValue = textview2.text.toString()
            val newValue = oldValue + "7"
            textview2.text = newValue
            if(method == "") {
                var1 += "7"
            } else {
                var2 += "7"
            }
        }
        val num8 = findViewById<Button>(R.id.num8)
        num8.setOnClickListener {
            val oldValue = textview2.text.toString()
            val newValue = oldValue + "8"
            textview2.text = newValue
            if(method == "") {
                var1 += "8"
            } else {
                var2 += "8"
            }
        }
        val num9 = findViewById<Button>(R.id.num9)
        num9.setOnClickListener {
            val oldValue = textview2.text.toString()
            val newValue = oldValue + "9"
            textview2.text = newValue
            if(method == "") {
                var1 += "9"
            } else {
                var2 += "9"
            }
        }
        val num0 = findViewById<Button>(R.id.num0)
        num0.setOnClickListener {
            val oldValue = textview2.text.toString()
            val newValue = oldValue + "0"
            textview2.text = newValue
            if(method == "") {
                var1 += "0"
            } else {
                var2 += "0"
            }
        }
        val clear = findViewById<Button>(R.id.clear)
        clear.setOnClickListener {
            var1 = ""
            var2 = ""
            method = ""
            textview2.text = ""
        }
        val cong = findViewById<Button>(R.id.cong)
        cong.setOnClickListener {
            val oldValue = textview2.text.toString()
            val newValue = "$oldValue+"
            textview2.text = newValue
            method += "+"
        }
        val tru = findViewById<Button>(R.id.tru)
        tru.setOnClickListener {
            val oldValue = textview2.text.toString()
            val newValue = "$oldValue-"
            textview2.text = newValue
            method += "-"
        }
        val nhan = findViewById<Button>(R.id.nhan)
        nhan.setOnClickListener {
            val oldValue = textview2.text.toString()
            val newValue = "$oldValue*"
            textview2.text = newValue
            method += "*"
        }
        val chia = findViewById<Button>(R.id.chia)
        chia.setOnClickListener {
            val oldValue = textview2.text.toString()
            val newValue = "$oldValue/"
            textview2.text = newValue
            method += "/"
        }
        val result = findViewById<Button>(R.id.result)
        result.setOnClickListener {
            textview2.text = getResult()
        }
    }

    private fun getResult(): String {
        val result: Float
        val finalResult: String
        when (method) {
            "" -> {
                finalResult = var1
            }
            "+" -> {
                result = var1.toFloat() + var2.toFloat()
                finalResult = result.toString()
            }
            "-" -> {
                result = var1.toFloat() - var2.toFloat()
                finalResult = result.toString()
            }
            "*" -> {
                result = var1.toFloat() * var2.toFloat()
                finalResult = result.toString()
            }
            "/" -> {
                result = var1.toFloat() / var2.toFloat()
                finalResult = result.toString()
            }
            else -> {
                finalResult = "ERROR"
            }
        }
        return finalResult
    }
}