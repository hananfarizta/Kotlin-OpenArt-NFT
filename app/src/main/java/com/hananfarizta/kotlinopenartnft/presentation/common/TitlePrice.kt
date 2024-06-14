package com.hananfarizta.kotlinopenartnft.presentation.common

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hananfarizta.kotlinopenartnft.ui.theme.KotlinOpenArtNFTTheme
import com.hananfarizta.kotlinopenartnft.ui.theme.PlaceHolder
import com.hananfarizta.kotlinopenartnft.ui.theme.TitleActive
import com.hananfarizta.kotlinopenartnft.ui.theme.Typography

@Composable
fun TitlePrice(modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .padding(16.dp)
    ) {
        Text(
            text = "Reserve Price",
            style = Typography.displaySmall,
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal,
            color = TitleActive,
        )
        Text(
            text = "1.50 ETH",
            style = Typography.displaySmall,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = TitleActive,
        )
        Text(
            text = "\$2,683.73",
            style = Typography.displaySmall,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = PlaceHolder,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun TitlePricePreview() {
    KotlinOpenArtNFTTheme {
        TitlePrice()
    }
}