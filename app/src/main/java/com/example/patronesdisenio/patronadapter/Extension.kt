package com.example.patronesdisenio.patronadapter

import android.location.Location

fun Pair<Double, Double>.toLocation(): Location {
    val location = Location("")
    location.latitude = this.first
    location.longitude = this.second
    return location
}