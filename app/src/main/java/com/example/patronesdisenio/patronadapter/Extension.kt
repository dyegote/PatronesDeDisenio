package com.example.patronesdisenio.patronadapter

import android.graphics.Color
import android.location.Location

fun Pair<Double, Double>.toLocation(): Location {
    val location = Location("")
    location.latitude = this.first
    location.longitude = this.second
    return location
}


//Adapter with extension
fun Map2.showRoute(points: List<Pair<Double, Double>>) {
    this.showRouteOnMap(points.map { it.toLocation() }, Color.BLUE)
}

fun Map2.goToPosition(point: Pair<Double, Double>) {
    this.goToPosition(point.toLocation(), 10.0)
}

fun Map2.markArea(topLeft: Pair<Double, Double>, bottomRight: Pair<Double, Double>) {
    //Implementation
}