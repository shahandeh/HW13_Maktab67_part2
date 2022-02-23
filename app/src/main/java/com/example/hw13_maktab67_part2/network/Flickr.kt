package com.example.hw13_maktab67_part2.network

import retrofit2.Call
import retrofit2.http.*

interface Flickr {

    @GET("services/rest")
    fun getRepo(@QueryMap queryMap: Map<String, String>) : Call<FlickrApi>

}