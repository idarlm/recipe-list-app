package com.example.oblig2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.oblig2.ui.screens.RecipeListScreen
import com.example.oblig2.ui.screens.RecipeScreen
import com.example.oblig2.ui.screens.WelcomeScreen
import com.example.oblig2.ui.theme.Oblig2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Oblig2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val mainViewModel : MainViewModel by viewModels()
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "WelcomeScreen")
                    {
                        // WelcomeScreen shows a picture of Gordon Ramsey.
                        // Clicking the continue button navigates to RecipeListScreen.
                        composable("WelcomeScreen") {
                            WelcomeScreen {
                                navController.navigate("RecipeListScreen")
                            }
                        }

                        // RecipeListScreen shows a list of all recipes.
                        // Clicking a recipe leads to the RecipeScreen.
                        composable("RecipeListScreen") {
                            RecipeListScreen (mainViewModel = mainViewModel) {
                                navController.navigate("RecipeScreen")
                            }
                        }

                        // RecipeScreen shows extended info and instructions for a recipe.
                        composable("RecipeScreen") {
                            RecipeScreen(mainViewModel = mainViewModel)
                        }
                    }
                }
            }
        }
    }
}