package com.example.company.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.NumberFormatException

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        add.setOnClickListener{ calc(add) }
        subtr.setOnClickListener { calc(subtr) }
        mul.setOnClickListener{ calc(mul) }
        divide.setOnClickListener{ calc(divide) }
    }
    fun calc (v: View) {
        try {
            var a1 = arg1.text.toString().toInt()
            var a2 = arg2.text.toString().toInt()

            when(v.id) {
                R.id.add -> answer.text = (a1 + a2).toString()
                R.id.subtr -> answer.text = (a1 - a2).toString()
                R.id.mul -> answer.text = (a1 * a2).toString()
                R.id.divide -> if (a2 != 0) answer.text = (a1 / a2).toString()
                else answer.text = "Div by zero"
            }
        }
        catch (e:NumberFormatException){
            answer.text = "Input Error"
        }
    }
}
