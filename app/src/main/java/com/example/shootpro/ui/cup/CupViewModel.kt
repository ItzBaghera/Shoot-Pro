package com.example.shootpro.ui.cup

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CupViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is cup Fragment"
    }
    val text: LiveData<String> = _text
}