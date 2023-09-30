package com.example.patronesdisenio.patronfacade

import android.graphics.Bitmap

class Filter {
    val procesadorDeImagen = ProcesadorDeImagen()
    fun transformarABlancoYNegro(imagen: Bitmap): Bitmap {
        val imagen1 = procesadorDeImagen.edgeDetection(imagen)
        return procesadorDeImagen.convolution(imagen1)
    }

    fun aplicarFiltroRetro(imagen: Bitmap): Bitmap {
        TODO()
    }
}