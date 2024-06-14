package com.hananfarizta.kotlinopenartnft.presentation.common

import android.annotation.SuppressLint
import androidx.compose.animation.core.tween
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
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.fontscaling.MathUtils.lerp
import androidx.compose.ui.unit.sp
import com.hananfarizta.kotlinopenartnft.R
import com.hananfarizta.kotlinopenartnft.presentation.model.ListCard
import com.hananfarizta.kotlinopenartnft.presentation.model.dummyListCard
import com.hananfarizta.kotlinopenartnft.ui.theme.GreyScaleBody
import com.hananfarizta.kotlinopenartnft.ui.theme.GreyScaleLabel
import com.hananfarizta.kotlinopenartnft.ui.theme.KotlinOpenArtNFTTheme
import com.hananfarizta.kotlinopenartnft.ui.theme.TitleActive
import com.hananfarizta.kotlinopenartnft.ui.theme.Typography
import kotlinx.coroutines.delay
import kotlin.math.absoluteValue

@Composable
fun ImageCarouselCard(modifier: Modifier = Modifier, listCard: ListCard) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 20.dp, start = 16.dp, end = 16.dp)
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
                painter = painterResource(id = listCard.imgProduct),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(350.dp)
                    .clip(RoundedCornerShape(24.dp))
            )
            Text(
                text = stringResource(id = listCard.txtProduct),
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
                    painter = painterResource(id = listCard.imgProfile),
                    contentDescription = null,
                    modifier = modifier
                        .size(48.dp)
                )
                Column(
                    horizontalAlignment = Alignment.Start,
                    modifier = modifier
                ) {
                    Text(
                        text = stringResource(id = listCard.txtAuthor),
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
        ImageCarouselCard(
            listCard = ListCard(
                R.drawable.img_product1,
                R.drawable.img_profile1,
                R.string.txt_author1,
                R.string.txt_author1
            )
        )
    }
}

@SuppressLint("RestrictedApi")
@Composable
fun CardCarousel(modifier: Modifier = Modifier) {
    val pagerState = rememberPagerState(
        pageCount =
        { dummyListCard.size }
    )
    LaunchedEffect(Unit) {
        while (true) {
            delay(2000)
            val nextPage = (pagerState.currentPage + 1) % pagerState.pageCount
            pagerState.animateScrollToPage(
                page = nextPage,
                animationSpec = tween(
                    durationMillis = 1000 // Adjust the duration as needed
                )
            )
        }
    }

    Box(modifier = modifier.wrapContentSize()) {
        HorizontalPager(
            state = pagerState,
            modifier
                .wrapContentSize()

        ) {
                page -> val pageOffset = (
                    (pagerState.currentPage - page) + pagerState.currentPageOffsetFraction
                    ).absoluteValue

            ImageCarouselCard(
                listCard = dummyListCard[page],
                modifier = modifier
                    .graphicsLayer {
                        // Apply a scaling effect
                        val scale = lerp(0.85f, 1f, 1f - pageOffset.coerceIn(0f, 1f))
                        scaleX = scale
                        scaleY = scale
                    }
            )

        }
    }
}

@Preview
@Composable
private fun CardCarouselPreview() {
    KotlinOpenArtNFTTheme {
        CardCarousel()
    }
}