package com.example.hw13_maktab67_part2.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkManager {

    private val retrofit: Retrofit = Retrofit
        .Builder()
        .baseUrl("https://www.flickr.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val service = retrofit.create(Flickr::class.java)

}