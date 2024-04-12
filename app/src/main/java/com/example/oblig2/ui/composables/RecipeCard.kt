package com.example.oblig2.ui.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import coil.compose.AsyncImage

@Composable
fun RecipeCard(
    name: String,
    timeToMake: Int,
    imageURI: String?,
    onClick: () -> Unit
) {
    Row (
        horizontalArrangement = Arrangement.spacedBy(20.dp),
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(all = 5.dp)
            .shadow(elevation = 10.dp, shape = RoundedCornerShape(25.dp))
            .clip(shape = RoundedCornerShape(25.dp))
            .clickable(onClick = onClick)
            .background(MaterialTheme.colorScheme.surface)
            .padding(all = 20.dp)
            .fillMaxWidth()
    ) {
        // Image
        AsyncImage(
            model = imageURI,
            contentDescription = "A succulent chinese meal!",
            alignment = Alignment.Center,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(shape = RoundedCornerShape(25.dp))
                .width(100.dp)
                .height(100.dp)
        )

        // Text content
        Column (
            modifier = Modifier.fillMaxWidth()
        ) {
            // Title
            Text(
                text = name,
                fontSize = 6.em,
                color = MaterialTheme.colorScheme.onSurface,
            )
            // Time to make
            val hourText = when(timeToMake / 60) {
                0 -> ""
                else -> "${timeToMake/60}h "
            }
            val minuteText = when(timeToMake % 60) {
                0 -> ""
                else -> "${timeToMake % 60}min"
            }
            Text(
                text = hourText + minuteText,
                fontSize = 4.em,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
            )
        }
    }
}

@Preview
@Composable
fun RecipeCardPreview() {
    Column(
        verticalArrangement = Arrangement.spacedBy(0.dp),
        modifier = Modifier
            .background(MaterialTheme.colorScheme.background)
            .padding(10.dp),
    ) {
        RecipeCard(name = "Succulent chinese meal", timeToMake = 90, null, onClick = { })
        RecipeCard(name = "Hot dogs with ketchup", timeToMake = 20, null,onClick = { })
    }
}