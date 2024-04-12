package com.example.oblig2.ui.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.oblig2.recipe.Ingredient

@Composable
fun IngredientList(
    ingredients: List<Ingredient>,
) {
    Column (
        verticalArrangement = Arrangement.spacedBy(5.dp),
        modifier = Modifier
            .padding(all = 20.dp)
            .clip(RoundedCornerShape(20.dp))
            .background(MaterialTheme.colorScheme.surfaceVariant)
            .padding(all = 20.dp)
            .fillMaxWidth()
    ) {
        // Title
        Text(
            text = "Ingredients",
            fontWeight = FontWeight.Bold
        )

        // List all ingredients
        ingredients.forEach {
            Row {
                // Ingredient name
                Text(
                    text = it.ingredient,
                    modifier = Modifier
                        .weight(2f)
                )

                // Quantity
                Text(text = it.quantity.toString())
            }
        }
    }
}