package com.hananfarizta.kotlinopenartnft.presentation.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hananfarizta.kotlinopenartnft.R
import com.hananfarizta.kotlinopenartnft.ui.theme.GreyScaleBody
import com.hananfarizta.kotlinopenartnft.ui.theme.GreyScaleLabel
import com.hananfarizta.kotlinopenartnft.ui.theme.KotlinOpenArtNFTTheme
import com.hananfarizta.kotlinopenartnft.ui.theme.TitleActive
import com.hananfarizta.kotlinopenartnft.ui.theme.Typography

@Composable
fun ImageCarouselCard(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
            .height(IntrinsicSize.Max)
            .clip(RoundedCornerShape(32.dp))
            .background(Color.White)

    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(13.dp),
            modifier = modifier
                .padding(11.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.img_product1),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(400.dp)
                    .clip(RoundedCornerShape(24.dp))
            )
            Text(
                text = "Silent Wave",
                style = Typography.displaySmall,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = TitleActive,
            )
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = modifier
                    .padding(end = 16.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.img_profile1),
                    contentDescription = null,
                    modifier = modifier
                        .size(48.dp)
                )
                Column(
                    horizontalAlignment = Alignment.Start,
                    modifier = modifier
                ) {
                    Text(
                        text = "Pawel Czerwinski",
                        style = Typography.displaySmall,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = GreyScaleBody,
                    )
                    Text(
                        text = "Creator",
                        style = Typography.displaySmall,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Medium,
                        color = GreyScaleLabel,
                    )
                }
                Spacer(modifier = Modifier.weight(1f))
                Icon(
                    painter = painterResource(id = R.drawable.ic_love),
                    contentDescription = null,
                    modifier = modifier
                        .size(22.dp)
                )
            }
        }
    }
}

@Preview
@Composable
private fun ImageCarouselCardPreview() {
    KotlinOpenArtNFTTheme {
        ImageCarouselCard()
    }
}