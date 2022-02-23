package com.example.hw13_maktab67_part2

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.hw13_maktab67_part2.network.glide

class MyAdapter (private val listOfUrl : MutableList<String>) : RecyclerView.Adapter<MyAdapter.ImageViewHolder>() {

    class ImageViewHolder(imageView: View) : RecyclerView.ViewHolder(imageView){
        private val layoutImageView: ImageView = imageView.findViewById(R.id.image_view)
        fun bind (url: String){
            layoutImageView.glide(url)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.image, parent, false)
        return ImageViewHolder(view)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.bind(listOfUrl[position])
    }

    override fun getItemCount(): Int {
        return listOfUrl.size
    }



}