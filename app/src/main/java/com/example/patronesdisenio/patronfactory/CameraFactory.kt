package com.example.patronesdisenio.patronfactory

class CameraFactory {
    fun getCamera(type: CameraType) =
        when(type) {
            CameraType.CAMERA1 -> Camera1()
            CameraType.CAMERA2 -> Camera2()
        }
}

enum class CameraType {
    CAMERA1,
    CAMERA2
}