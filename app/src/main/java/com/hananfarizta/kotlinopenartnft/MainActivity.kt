package com.hananfarizta.kotlinopenartnft

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.hananfarizta.kotlinopenartnft.presentation.homepage.HomeScreen
import com.hananfarizta.kotlinopenartnft.ui.theme.BackGround
import com.hananfarizta.kotlinopenartnft.ui.theme.KotlinOpenArtNFTTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KotlinOpenArtNFTTheme(dynamicColor = false) {
                Box(modifier = Modifier.background(BackGround)) {
                    HomeScreen()
                }
            }
        }
    }
}