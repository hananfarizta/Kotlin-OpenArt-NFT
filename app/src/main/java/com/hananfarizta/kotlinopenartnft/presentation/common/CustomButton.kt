package com.hananfarizta.kotlinopenartnft.presentation.common

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hananfarizta.kotlinopenartnft.ui.theme.ButtonColor
import com.hananfarizta.kotlinopenartnft.ui.theme.GreyScaleBody
import com.hananfarizta.kotlinopenartnft.ui.theme.KotlinOpenArtNFTTheme
import com.hananfarizta.kotlinopenartnft.ui.theme.OffWhite
import com.hananfarizta.kotlinopenartnft.ui.theme.TitleActive
import com.hananfarizta.kotlinopenartnft.ui.theme.Typography

@Composable
fun CustomButton(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
            .padding(start = 16.dp, end = 16.dp)
    ) {
        GradientButton()
        GradientOutlinedButton()
    }
}

@Preview
@Composable
private fun CustomButtonPreview() {
    KotlinOpenArtNFTTheme {
        CustomButton()
    }
}

@Composable
fun GradientButton(
    modifier: Modifier = Modifier
) {
    Button(
        onClick = {},
        shape = RoundedCornerShape(8.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent
        ),
        contentPadding = PaddingValues(),
        modifier = modifier
            .fillMaxWidth()
            .height(56.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(ButtonColor),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Place a bid",
                style = Typography.displaySmall,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = OffWhite,
            )
        }
    }
}

@Composable
fun GradientOutlinedButton(modifier: Modifier = Modifier) {
    OutlinedButton(
        onClick = { },
        shape = RoundedCornerShape(8.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent
        ),
        contentPadding = PaddingValues(),
        border = BorderStroke(2.dp, ButtonColor),
        modifier = modifier
            .fillMaxWidth()
            .height(56.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "View artwork",
                style = Typography.displaySmall,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = TitleActive,
            )
        }
    }
}