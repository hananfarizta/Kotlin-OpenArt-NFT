package com.hananfarizta.kotlinopenartnft.presentation.common

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hananfarizta.kotlinopenartnft.R
import com.hananfarizta.kotlinopenartnft.ui.theme.KotlinOpenArtNFTTheme
import com.hananfarizta.kotlinopenartnft.ui.theme.PlaceHolder
import com.hananfarizta.kotlinopenartnft.ui.theme.SearchBarColor

@Composable
fun CustomSearchBar(modifier: Modifier = Modifier) {
    TextField(
        modifier = modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp, top = 16.dp)
            .height(50.dp),
        value = "",
        onValueChange = {},
        leadingIcon = {
            Icon(
                painter = painterResource(id = R.drawable.ic_search),
                contentDescription = null,
                modifier = modifier.size(20.dp)
            )
        },
        placeholder = {
            Text(
                text = "Search items, collections, and accounts",
                style = MaterialTheme.typography.bodyMedium.copy(
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Medium,
                    color = PlaceHolder
                )
            )
        },
        trailingIcon = {
            Icon(
                painter = painterResource(id = R.drawable.ic_microphone),
                contentDescription = null,
                modifier = modifier.size(20.dp)
            )
        },
        shape = RoundedCornerShape(8.dp),
        colors = TextFieldDefaults.colors(
            unfocusedContainerColor = SearchBarColor,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,

        ),
        textStyle = MaterialTheme.typography.bodySmall,
        singleLine = true,
    )
}

@Preview(showBackground = true)
@Composable
private fun CustomSearchBarPreview() {
    KotlinOpenArtNFTTheme {
        CustomSearchBar()
    }
}