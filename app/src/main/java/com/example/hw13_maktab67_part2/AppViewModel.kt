package com.example.hw13_maktab67_part2

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.hw13_maktab67_part2.network.FlickrApi
import com.example.hw13_maktab67_part2.network.NetworkManager
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class AppViewModel : ViewModel() {

    private val _url : MutableLiveData<MutableList<String>> = MutableLiveData()
    val url : LiveData<MutableList<String>> get() = _url


    
}