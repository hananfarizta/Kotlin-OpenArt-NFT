package com.hananfarizta.kotlinopenartnft.presentation.common

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hananfarizta.kotlinopenartnft.ui.theme.GreyScaleLabel
import com.hananfarizta.kotlinopenartnft.ui.theme.KotlinOpenArtNFTTheme
import com.hananfarizta.kotlinopenartnft.ui.theme.Typography

@Composable
fun TitleHomeScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(top = 20.dp)
    ) {
        Text(
            text = "Discover, collect, and sell",
            style = Typography.displaySmall,
            color = GreyScaleLabel,
            modifier = modifier
        )
        Text(
            text = "Your Digital Art",
            style = Typography.displayMedium,
            modifier = modifier
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun TitleHomeScreenPreview() {
    KotlinOpenArtNFTTheme {
        TitleHomeScreen()
    }
}