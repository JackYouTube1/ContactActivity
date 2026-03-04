package com.example.mycontacts

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        //code here
        val firstName = "Jack"
        val lastName = "Falconer"
        var address = "51 john Rumble Street"
        var isMale = "true"
        var dayOfBirth = "20"
        var monthOfBirth = "06"
        var yearOfBirth = "2003"

        //Log.d("hello! my name is $firstName $lastName")
       // Log.d("I live at $address" + "my birthday is $monthOfBirth/$dayOfBirth/$yearOfBirth" + "and I am a ${if (isMale) "male" else "female"}")

        Log.d("ContactInfo", "Hello! My name is $firstName $lastName")







        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}