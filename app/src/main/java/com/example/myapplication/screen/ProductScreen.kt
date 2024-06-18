package com.example.myapplication.screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.example.myapplication.R
import com.example.myapplication.model.Product


@Composable
fun ProductScreen() {

}

fun getProductList(): List<Product>{
    return listOf(
        Product(
            id = "1",
            color= Color.Magenta,
            price = 1200f,
            name = "Shoes",
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.hri,
            size = 8


        )
    )
}