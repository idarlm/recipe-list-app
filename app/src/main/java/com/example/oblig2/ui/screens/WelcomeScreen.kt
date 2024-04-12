package com.example.oblig2.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.oblig2.R

@Composable
fun WelcomeScreen (
    onContinue: () -> Unit
) {
    Box(
        contentAlignment = Alignment.BottomCenter,
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painterResource(id = R.drawable.gordon),
                contentScale = ContentScale.FillHeight,
                alignment = Alignment.Center,
            )
    ) {
        // continue button
        Button(onClick = onContinue, modifier = Modifier.padding(bottom = 150.dp)) {
            Text(text = "Start cooking with Gordon Ramsay!")
        }
    }
}