package com.travel.exploreease.navigation

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.EaseIn
import androidx.compose.animation.core.EaseOut
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.travel.exploreease.ui.composables.DetailsCompose
import com.travel.exploreease.ui.composables.HomeCompose
import com.travel.exploreease.ui.composables.IntroCompose
import com.travel.exploreease.ui.composables.ProfileCompose
import com.travel.exploreease.ui.composables.SplashScreen
import com.travel.exploreease.ui.viewmodels.MainViewModel

@Composable
fun AppNavigation(viewModel: MainViewModel) {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "splash") {

        composable(route = "splash",
            enterTransition = {
                fadeIn(
                    animationSpec = tween(
                        3000, easing = LinearEasing
                    )
                ) + slideIntoContainer(
                    animationSpec = tween(3000, easing = EaseIn),
                    towards = AnimatedContentTransitionScope.SlideDirection.Start
                )
            },
            exitTransition = {
                fadeOut(
                    animationSpec = tween(
                        2000, easing = LinearEasing
                    )
                ) + slideOutOfContainer(
                    animationSpec = tween(1000, easing = EaseOut),
                    towards = AnimatedContentTransitionScope.SlideDirection.End
                )
            }
        ) {
            SplashScreen() {
                navController.navigate("intro")
            }
        }

        composable("intro",
            exitTransition = {
                fadeOut(
                    animationSpec = tween(
                        1000, easing = LinearEasing
                    )
                ) + slideOutOfContainer(
                    animationSpec = tween(1000, easing = EaseOut),
                    towards = AnimatedContentTransitionScope.SlideDirection.End
                )
            }) {
            IntroCompose {
                navController.navigate("home")
            }
        }

        composable("home") {
            HomeCompose(viewModel, navController)
        }

        composable("details") {
            DetailsCompose()
        }

        composable("profile",
            enterTransition = {
                fadeIn(
                    animationSpec = tween(
                        500, easing = LinearEasing
                    )
                )
            },
            exitTransition = {
                fadeOut(
                    animationSpec = tween(
                        500, easing = LinearEasing
                    )
                )
            }) {
            ProfileCompose()
        }
    }
}