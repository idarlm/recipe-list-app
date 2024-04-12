package com.example.oblig2.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import com.example.oblig2.MainViewModel
import com.example.oblig2.ui.composables.RecipeCard

@Composable
fun RecipeListScreen(
    mainViewModel: MainViewModel = MainViewModel(),
    onSelectRecipe: () -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        // Title
        Text(
            text = "Recipes",
            fontSize = 8.em,
            modifier = Modifier.padding(all = 20.dp)
        )

        // Recipe list
        LazyColumn (
            verticalArrangement = Arrangement.spacedBy(5.dp),
            modifier = Modifier
                .padding(horizontal = 10.dp)
                .fillMaxSize()
        ) {
            mainViewModel.getAllRecipes().forEach {
                item {
                    RecipeCard(name = it.name, timeToMake = it.timeToMake, imageURI = it.imageURI) {
                        // select the recipe we clicked on.
                        // passing arguments via navhost.navigate is probably preferred...
                        mainViewModel.selectRecipe(it.id)
                        onSelectRecipe()
                    }
                }
            }
        }
    }
}