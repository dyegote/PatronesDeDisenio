package com.example.patronesdisenio.patronfactory

interface Camera {
    fun open()
    fun takePicture()
    fun recordVideo()
    fun close()
}

class Camera1: Camera {
    override fun open() {
        println("Abriendo Camera1")
    }

    override fun takePicture() {
        println("Sacando foto con Camera1")
    }

    override fun recordVideo() {
        println("Grabando video con Camera1")
    }

    override fun close() {
        println("Cerrando Camera1")
    }
}

class Camera2: Camera {
    override fun open() {
        println("Abriendo Camera2")
    }

    override fun takePicture() {
        println("Sacando foto con Camera2")
    }

    override fun recordVideo() {
        println("Grabando video con Camera2")
    }

    override fun close() {
        println("Cerrando Camera2")
    }
}