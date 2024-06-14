package com.hananfarizta.kotlinopenartnft.presentation.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.hananfarizta.kotlinopenartnft.R

data class ListCard(@DrawableRes val imgProduct: Int, @DrawableRes val imgProfile: Int, @StringRes val txtProduct: Int,  @StringRes val txtAuthor: Int)

data class Quadruple<A, B, C, D>(
    val first: A,
    val second: B,
    val third: C,
    val fourth: D
)

val dummyListCard = listOf(
    Quadruple(R.drawable.img_product1, R.drawable.img_profile1,R.string.txt_title1, R.string.txt_author1),
    Quadruple(R.drawable.img_product2, R.drawable.img_profile2, R.string.txt_title2, R.string.txt_author2),
    Quadruple(R.drawable.img_product3, R.drawable.img_profile3, R.string.txt_title3, R.string.txt_author3),
    Quadruple(R.drawable.img_product4, R.drawable.img_profile4, R.string.txt_title4, R.string.txt_author4),
    Quadruple(R.drawable.img_product5, R.drawable.img_profile5, R.string.txt_title5, R.string.txt_author5)
).map { ListCard(it.first, it.second, it.third, it.fourth) }