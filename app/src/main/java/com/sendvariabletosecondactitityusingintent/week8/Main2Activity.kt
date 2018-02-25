package com.sendvariabletosecondactitityusingintent.week8

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val txtShow = findViewById<TextView>(R.id.txtShow)

        val strShow: String = intent.getStringExtra("SendInfo")
        txtShow.text =strShow

    }
}
