package com.example.a_start.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a_start.data.AStartData

@Composable
fun AStartItem(item: AStartData, modifier: Modifier = Modifier) {

    Surface(
        modifier = modifier.padding(8.dp),
        shadowElevation = 4.dp
    ) {
    Column (
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = painterResource(item.imageMain),
            contentDescription = null,
            modifier = modifier
                .size(350.dp)
                .fillMaxWidth(1f)
        )
        Text(
            text = item.title,
            style = MaterialTheme.typography.titleLarge,
            modifier = modifier
        )

        Spacer(modifier = modifier.padding(16.dp))

        Row (
            modifier = Modifier
                .fillMaxWidth(1f)
                .padding(bottom = 8.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                painter = painterResource(item.varCircleImage),
                contentDescription = null,
                modifier = Modifier
                    .clip(CircleShape)
                    .size(25.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = item.text,
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(start = 8.dp)

            )
            //  if (count > 0) {
            Text(
                text = "${item.number}${item.days}",
                modifier = Modifier.padding(start = 12.dp)
            )
            //}
            // share icon
            Spacer(modifier = Modifier.width(150.dp))
            Icon(
                imageVector = Icons.Default.Share,
                contentDescription = null

                )
            // 3-dot menu icon
            Spacer(modifier = Modifier.width(12.dp))
            Icon(
                imageVector = Icons.Default.MoreVert,
                contentDescription = null,
                modifier = modifier.size(24.dp)
            )

        }
    }
}
}




@Preview(showBackground = true)
@Composable
fun AStartItemPreview(modifier: Modifier = Modifier) {
    StartScreen()

}