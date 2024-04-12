package com.example.oblig2.ui.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun InstructionList(
    instructions: List<String>
) {
    Column (
        verticalArrangement = Arrangement.spacedBy(10.dp),
        modifier = Modifier
            .padding(start = 20.dp, end = 20.dp, top = 20.dp, bottom = 40.dp)
            .fillMaxWidth()
    ) {
        instructions.forEachIndexed { index, s ->
            Column {
                // Step number
                Text(
                    text = "Step ${index + 1}",
                    fontWeight = FontWeight.Bold
                )

                // Instruction text
                Text(text = s)
            }
        }
    }
}