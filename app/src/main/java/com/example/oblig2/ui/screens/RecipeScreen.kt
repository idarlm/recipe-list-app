package com.example.oblig2.ui.screens

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.oblig2.MainViewModel
import com.example.oblig2.ui.composables.IngredientList
import com.example.oblig2.ui.composables.InstructionList

@Composable
fun RecipeScreen(
    mainViewModel: MainViewModel,
) {
    val recipe = mainViewModel.getSelectedRecipe()

    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.verticalScroll(ScrollState(0))
    ) {
        // Title
        Text(
            text = recipe.name,
            fontSize = TextUnit(8f, TextUnitType.Em),
            modifier = Modifier.padding(all = 20.dp)
        )

        // Image
        AsyncImage(
            model = recipe.imageURI,
            contentDescription = "Image of the dish",
            alignment = Alignment.Center,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxWidth()
        )

        // Ingredient list
        IngredientList(ingredients = recipe.ingredients)

        // Instructions
        InstructionList(instructions = recipe.instructions)
    }
}