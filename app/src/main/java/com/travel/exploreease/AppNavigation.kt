package com.travel.exploreease

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation(){

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "intro"){

        composable("splash"){
            SplashScreen()
        }

        composable("intro"){
            IntroCompose {
                navController.navigate("home")
            }
        }

        composable("home"){
            HomeCompose(navController)
        }

        composable("details"){
            DetailsCompose()
        }
    }
}