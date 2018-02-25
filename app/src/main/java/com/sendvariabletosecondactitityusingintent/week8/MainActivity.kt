package com.sendvariabletosecondactitityusingintent.week8

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnShow = findViewById<Button>(R.id.btnPage2)
        val txtSend = findViewById<EditText>(R.id.txtsend)

        btnShow.setOnClickListener(View.OnClickListener {
            //Intent used to send data between activities
            val intent = Intent(this, Main2Activity::class.java)
            //putExtra sets of values to name SendInfo
            intent.putExtra("SendInfo",txtSend.text.toString())
            //go to second activity
            startActivity(intent)

        })
    }
}
