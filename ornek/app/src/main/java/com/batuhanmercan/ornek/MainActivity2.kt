package com.batuhanmercan.ornek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var textView = findViewById<TextView>(R.id.textView)
        var username = intent.getStringExtra("username")
        textView.text = "Hoşgeldiniz : ${username}"
    }

}