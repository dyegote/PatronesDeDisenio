package com.example.patronesdisenio.patronabstractfactory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.patronesdisenio.MainActivity
import com.example.patronesdisenio.R

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    private fun patronAbstractFactory() {
        MainActivity.start(this)
        MainActivity.startActivityForResult(this, 0)
    }
}