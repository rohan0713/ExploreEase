package com.travel.exploreease.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.core.view.WindowCompat
import com.travel.exploreease.domain.repositories.MainRepository
import com.travel.exploreease.navigation.AppNavigation
import com.travel.exploreease.ui.theme.ExploreEaseTheme
import com.travel.exploreease.ui.viewmodels.MainViewModel
import com.travel.exploreease.ui.viewmodels.ViewModelProviderFactory

class MainActivity : ComponentActivity() {

    private val viewModel : MainViewModel by viewModels {
        ViewModelProviderFactory(MainRepository())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ExploreEaseTheme {
                // A surface container using the 'background' color from the theme
                WindowCompat.setDecorFitsSystemWindows(window, false)
                AppNavigation(viewModel)
            }
        }
    }
}

