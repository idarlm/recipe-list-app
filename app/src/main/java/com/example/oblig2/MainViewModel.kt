package com.example.oblig2

import androidx.lifecycle.ViewModel
import com.example.oblig2.recipe.Recipe
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainViewModel : ViewModel() {
    // hardcoded recipe list
    private val _recipes : List<Recipe> = Recipe.exampleList()
    private var _selectedId = 0

    /**
     * Returns a list of all recipes.
     */
    fun getAllRecipes() : List<Recipe> {
        return _recipes
    }

    /**
     * Mark the recipe with id as selected.
     */
    fun selectRecipe(id: Int) {
        _selectedId = id
    }

    /**
     * Returns the currently selected recipe.
     */
    fun getSelectedRecipe() : Recipe {
        return _recipes.first { it.id == _selectedId }
    }
}