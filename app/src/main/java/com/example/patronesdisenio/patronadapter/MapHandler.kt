package com.example.patronesdisenio.patronadapter

class MapHandler {
    val map: Map1 = Map1()

    fun useMap() {
        map.goToPosition(Pair(0.5, 4.2))
        map.showRoute(listOf(Pair(0.5, 4.2), Pair(0.8, 4.9)))
        map.markArea(Pair(0.5, 4.2), Pair(0.8, 4.9))
    }
}