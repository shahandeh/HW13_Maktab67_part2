package com.example.hw13_maktab67_part2

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.hw13_maktab67_part2.network.FlickrApi
import com.example.hw13_maktab67_part2.network.NetworkManager
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        val temp = mutableListOf<String>()

        val apiParams = mapOf(
            "api_key" to "1c04e05bce6e626247758d120b372a73",
            "method" to "flickr.photos.getRecent",
            "extras" to "url_s",
            "format" to "json",
            "nojsoncallback" to "1",
            "per_page" to "100",
            "page" to "1"
        )
        NetworkManager.service.getRepo(apiParams).enqueue(object : Callback<FlickrApi> {
            override fun onResponse(call: Call<FlickrApi>, response: Response<FlickrApi>) {
                response.body()?.photos?.photo?.forEach {
                    temp.add(it.url_s)
                    recyclerView.adapter = MyAdapter(temp)
                }
            }

            override fun onFailure(call: Call<FlickrApi>, t: Throwable) {
                Log.d(TAG, "onFailure: ${t.message}")
            }
        })



    }
}