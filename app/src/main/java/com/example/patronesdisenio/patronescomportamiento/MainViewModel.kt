package com.example.patronesdisenio.patronescomportamiento

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    private val _numeroDeToques: MutableLiveData<Int> = MutableLiveData()
    val numeroDeToques: LiveData<Int>
        get() = _numeroDeToques

    init {
        _numeroDeToques.value = 0
    }

    fun onButtonClick() {
       _numeroDeToques.value?.let {
           _numeroDeToques.value = it + 1
       }
    }
}