package com.example.patronesdisenio

object MiSingleton {

    var ancho: Int = 260
    var alto: Int = 260

    init {
        //Esto solo se ejecuta una vez
        println("Inicializando MiSingleton")
    }
}