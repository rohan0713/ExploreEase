package com.travel.exploreease.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import com.travel.exploreease.navigation.AppNavigation
import com.travel.exploreease.ui.theme.ExploreEaseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExploreEaseTheme {
                // A surface container using the 'background' color from the theme
                WindowCompat.setDecorFitsSystemWindows(window, false)
                AppNavigation()
            }
        }
    }
}

