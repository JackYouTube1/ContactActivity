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

        val firstName = "Jack"
        val lastName = "Falconer"
        val address = "51 John Rumble Street"
        val isMale = true
        val dayOfBirth = "20"
        val monthOfBirth = "06"
        val yearOfBirth = "2003"


        Log.d(
            "ContactInfo",
            "Hello! My name is $firstName $lastName. I live at $address. My birthday is $monthOfBirth/$dayOfBirth/$yearOfBirth and I am ${if (isMale) "male" else "female"}."
        )








        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}