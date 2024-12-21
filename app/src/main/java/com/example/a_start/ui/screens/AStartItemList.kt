package com.example.a_start.ui.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.a_start.data.aStartDataList

@Composable
fun AStartItemList( modifier: Modifier = Modifier) {


    LazyColumn (modifier = modifier){
        items(aStartDataList){item ->
            AStartItem(item = item)
        }

    }

}
