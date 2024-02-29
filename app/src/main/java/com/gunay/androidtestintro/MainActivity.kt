package com.gunay.androidtestintro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val tax = Tax()
        val income = tax.calculateIncome(100.0,0.1)
        val income_two = tax.calculateTax(100.0,0.1)

        System.out.println(income)
        System.out.println(income_two)

    }
}