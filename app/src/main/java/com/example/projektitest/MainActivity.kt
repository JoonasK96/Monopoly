package com.example.projektitest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var num = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dec1 = findViewById<Button>(R.id.buttonDec1)
        val dec2 = findViewById<Button>(R.id.buttonDec2)
        val dec3 = findViewById<Button>(R.id.buttonDec3)
        val add1 = findViewById<Button>(R.id.buttonAdd1)
        val add2 = findViewById<Button>(R.id.buttonAdd2)
        val add3 = findViewById<Button>(R.id.buttonAdd3)

        val textView = findViewById<TextView>(R.id.textView)


        dec1.setOnClickListener{
         num--
         textView.text = num.toString()
         }
        dec2.setOnClickListener{
            num -= 10
            textView.text = num.toString()
        }
        dec3.setOnClickListener{
            num -= 100
            textView.text = num.toString()
        }
        add1.setOnClickListener{
            num++
            textView.text = num.toString()
        }
        add2.setOnClickListener{
            num += 10
            textView.text = num.toString()
        }
        add3.setOnClickListener{
            num += 100
            textView.text = num.toString()
        }

    }


}