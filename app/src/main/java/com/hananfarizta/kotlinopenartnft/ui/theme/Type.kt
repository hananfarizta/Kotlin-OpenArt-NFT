package com.hananfarizta.kotlinopenartnft.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.hananfarizta.kotlinopenartnft.R

// Set of Material typography styles to start with
val Epilogue = FontFamily(
    listOf(
        Font(R.font.epilogue_black, FontWeight.Black),
        Font(R.font.epilogue_bold, FontWeight.Bold),
        Font(R.font.epilogue_extrabold, FontWeight.ExtraBold),
        Font(R.font.epilogue_light, FontWeight.ExtraLight),
        Font(R.font.epilogue_medium, FontWeight.Medium),
        Font(R.font.epilogue_regular, FontWeight.Normal),
        Font(R.font.epilogue_semibold, FontWeight.SemiBold),
        Font(R.font.epilogue_thin, FontWeight.Thin)
    )
)

    val Typography = Typography(
        displaySmall = TextStyle(
            fontSize = 18.sp,
            fontFamily = Epilogue,
            fontWeight = FontWeight.Bold,
            lineHeight = 28.sp,
        ),
        displayMedium = TextStyle(
            fontSize = 32.sp,
            fontFamily = Epilogue,
            fontWeight = FontWeight.Bold,
            lineHeight = 48.sp,
        ),
        bodySmall = TextStyle(
            fontSize = 14.sp,
            fontFamily = Epilogue,
            fontWeight = FontWeight.Normal,
            lineHeight = 21.sp,
        ),
        bodyMedium = TextStyle(
            fontSize = 16.sp,
            fontFamily = Epilogue,
            fontWeight = FontWeight.Normal,
            lineHeight = 24.sp,
        ),
        labelSmall = TextStyle(
            fontSize = 13.sp,
            fontFamily = Epilogue,
            fontWeight = FontWeight.Normal,
            lineHeight = 19.sp,
        ),

)
//    bodyLarge = TextStyle(
//        fontFamily = FontFamily.Default,
//        fontWeight = FontWeight.Normal,
//        fontSize = 16.sp,
//        lineHeight = 24.sp,
//        letterSpacing = 0.5.sp
//    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
