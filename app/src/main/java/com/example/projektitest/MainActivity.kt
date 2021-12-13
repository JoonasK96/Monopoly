package com.example.projektitest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.projektitest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var num = 0
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

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

        binding.buttonNext.setOnClickListener {
            replaceFragment(ScoreFrag())
        }

    }

   /* val firstFragment = FirstFragment()
    supportFragmentManager.beginTransaction().replace() */

    private fun replaceFragment(fragment: Fragment) {

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer,fragment)
        fragmentTransaction.commit()
    }


}