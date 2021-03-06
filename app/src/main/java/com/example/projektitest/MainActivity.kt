package com.example.projektitest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.projektitest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var num = 0
    lateinit var binding: ActivityMainBinding
    var playerN = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(ScoreFrag())


        val dec1 = findViewById<Button>(R.id.buttonDec1)
        val dec2 = findViewById<Button>(R.id.buttonDec2)
        val dec3 = findViewById<Button>(R.id.buttonDec3)
        val add1 = findViewById<Button>(R.id.buttonAdd1)
        val add2 = findViewById<Button>(R.id.buttonAdd2)
        val add3 = findViewById<Button>(R.id.buttonAdd3)
        val b1 = findViewById<Button>(R.id.button1)
        val b2 = findViewById<Button>(R.id.button2)
        val b3 = findViewById<Button>(R.id.button3)
        val b4 = findViewById<Button>(R.id.button4)

        val textView = findViewById<TextView>(R.id.textView)


        dec1.setOnClickListener {
            num--
            textView.text = num.toString()
        }
        dec2.setOnClickListener {
            num -= 10
            textView.text = num.toString()
        }
        dec3.setOnClickListener {
            num -= 100
            textView.text = num.toString()
        }
        add1.setOnClickListener {
            num++
            textView.text = num.toString()
        }
        add2.setOnClickListener {
            num += 10
            textView.text = num.toString()
        }
        add3.setOnClickListener {
            num += 100
            textView.text = num.toString()
        }
        b1.setOnClickListener {
            playerN = 0
        }
        b2.setOnClickListener {
            playerN = 1
        }
        b3.setOnClickListener {
            playerN = 2
        }
        b4.setOnClickListener {
            playerN = 3
        }

        binding.buttonNext.setOnClickListener {
            Player.updateMoney(playerN, num)
            Log.d("array", Player.players.toString())
            replaceFragment(ScoreFrag())
        }

    }

    /* val firstFragment = FirstFragment()
     supportFragmentManager.beginTransaction().replace() */

    private fun replaceFragment(fragment: Fragment) {

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer, fragment)
        fragmentTransaction.commit()
    }


}