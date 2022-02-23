package com.example.hw13_maktab67_part2.network

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.example.hw13_maktab67_part2.R

@BindingAdapter("glide")
fun ImageView.glide(url: String){
    Glide
        .with(this)
        .load(url)
        .placeholder(R.drawable.loading_animation)
        .into(this)
}