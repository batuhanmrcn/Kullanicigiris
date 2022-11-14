package com.batuhanmercan.ornek

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var editText = findViewById<EditText>(R.id.editText1)
        var editText2 = findViewById<EditText>(R.id.editText2)
        var button = findViewById<Button>(R.id.button)

         button.setOnClickListener {
             if (editText.text.isEmpty()){
                 Toast.makeText(this,"Kullanıcı Adı Giriniz",Toast.LENGTH_SHORT)
                     .show()
                 return@setOnClickListener
             }
             if (editText2.text.isEmpty()){
                 Toast.makeText(this,"Şifre Giriniz",Toast.LENGTH_SHORT)
                     .show()
                 return@setOnClickListener
             } else {
                 if (editText2.text.length < 6){
                     Toast.makeText(this,"6'dan fazla karakter giriniz",Toast.LENGTH_SHORT)
                         .show()
                 } else {
                     val intent = Intent(this, MainActivity2::class.java)
                     intent.putExtra("username",editText.text.toString())
                     startActivity(intent)
                 }
             }
         }
    }

}