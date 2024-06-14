package com.hananfarizta.kotlinopenartnft.presentation.homepage

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.hananfarizta.kotlinopenartnft.presentation.common.CardCarousel
import com.hananfarizta.kotlinopenartnft.presentation.common.CustomAppBar
import com.hananfarizta.kotlinopenartnft.presentation.common.CustomButton
import com.hananfarizta.kotlinopenartnft.presentation.common.CustomSearchBar
import com.hananfarizta.kotlinopenartnft.presentation.common.ImageCarouselCard
import com.hananfarizta.kotlinopenartnft.presentation.common.TitleHomeScreen
import com.hananfarizta.kotlinopenartnft.presentation.common.TitlePrice
import com.hananfarizta.kotlinopenartnft.ui.theme.KotlinOpenArtNFTTheme

@Composable
fun HomeScreen() {
    KotlinOpenArtNFTTheme {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            CustomAppBar()
            CustomSearchBar()
            CardCarousel()
            TitlePrice()
            CustomButton()
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    KotlinOpenArtNFTTheme {
        HomeScreen()
    }
}