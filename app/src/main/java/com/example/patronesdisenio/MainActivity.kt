package com.example.patronesdisenio

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.patronesdisenio.patronabstractfactory.ActivityFactory
import com.example.patronesdisenio.patronbuilder.Usuario
import com.example.patronesdisenio.patronfactory.Camera
import com.example.patronesdisenio.patronfactory.CameraFactory
import com.example.patronesdisenio.patronfactory.CameraType

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

        patronFactory()

        patronSingleton()
    }

    private fun patronSingleton() {
        MiSingleton.ancho = 500
    }
    private fun patronFactory() {
        val camera: Camera = CameraFactory().getCamera(CameraType.CAMERA1)
    }

    companion object: ActivityFactory() {
        override fun getIntent(context: Context): Intent {
            return Intent(context, MainActivity::class.java)
        }

    }
}