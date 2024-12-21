package com.example.a_start.ui.topics

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ComposeListScreen(modifier: Modifier = Modifier) {

    LazyColumn {
        itemsIndexed(
            listOf("This", "is", "Jetpack", "Compose")

        ){ index, string ->
            Text(
                text = string,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 24.dp)
                )
    }


    // LazyColumn is a vertically scrolling list that only composes and lays out AND CAN REPLACE THE CODE BELOW
//    val scrollState = rememberScrollState()
//
//    Column (
//        modifier = Modifier.verticalScroll(scrollState)
//    ){
//        for (i in 1..50) {
//            Text(
//                text = "Item $i",
//                fontSize = 24.sp,
//                fontWeight = FontWeight.Bold,
//                textAlign = Alignment.Center,
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(vertical = 24.dp)
//            )
//        }
//
    }
}