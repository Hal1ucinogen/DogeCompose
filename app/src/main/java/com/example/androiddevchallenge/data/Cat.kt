package com.example.androiddevchallenge.data

import androidx.annotation.DrawableRes

data class Cat(
    val name: String,
    val location: String,
    val age: String,
    val gender: String,
    val size: String,
    @DrawableRes val picture: Int
)
