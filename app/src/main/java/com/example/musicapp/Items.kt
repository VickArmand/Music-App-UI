package com.example.musicapp

data class Items (val image: Int,
                  val name: String,
                  val desc: String)

object Data{
    val dataList= listOf<Items>(
        Items(R.mipmap.marshmello, "Marshmello","Dance Artist"),
        Items(R.mipmap.marshmello, "Marshmello","Dance Artist"),
        Items(R.mipmap.juicewrld, "Juice WRLD","Hip Hop Artist"),
        Items(R.mipmap.juicewrld, "Juice WRLD","Hip Hop Artist"),
        Items(R.mipmap.marshmello, "Marshmello","Dance Artist"),
        Items(R.mipmap.marshmello, "Marshmello","Dance Artist")
    )
}