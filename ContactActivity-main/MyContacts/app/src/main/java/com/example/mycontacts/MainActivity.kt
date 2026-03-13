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



      //Calculate wages
        val rateOfPay = 20
        val hoursWorked = 50
        val overTime = 1.5

        if (hoursWorked > 40) {

            val regularPay = 40 * rateOfPay
            val overTimeHours = hoursWorked - 40
            val overtimePay = overTimeHours * rateOfPay * overTime

            val totalPay = regularPay + overtimePay

            println("Overtime hours: $overTimeHours")
            println("Total pay: $totalPay")

        } else {

            val regularPay = hoursWorked * rateOfPay
            println("Regular hours pay: $regularPay")
        }

        // Age calculations
        val currentYear = 2024
        val ageInYears = currentYear - yearOfBirth.toInt()

        // Years until the student turns 100
        val yearsUntil100 = (100 - ageInYears)

        // Age in months
        val ageInMonths = ageInYears * 12

        // Age in days (skipping leap years)
        val ageInDays = ageInYears * 365

        // Remainder when age is divided by 5
        val ageRemainderBy5 = ageInYears % 5

        // Print all calculated values
        Log.d("AgeCalculations", "Years until turning 100: $yearsUntil100")
        Log.d("AgeCalculations", "Age in months: $ageInMonths")
        Log.d("AgeCalculations", "Age in days (no leap years): $ageInDays")
        Log.d("AgeCalculations", "Age remainder divided by 5: $ageRemainderBy5")




        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}