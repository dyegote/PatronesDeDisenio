package com.example.patronesdisenio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.patronesdisenio.patronbuilder.Usuario

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Patron Builder
        val usuario = Usuario.Builder(1234, "Juan")
            .setApellido("Tobar")
            .setEamil("dyegote@hotmail.com")
            .build()

        val alertDialog = AlertDialog.Builder(this)
            .setTitle("Titulo")
            .setMessage("Mensaje")
            .create()
    }
}