package com.travel.exploreease.ui.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.travel.exploreease.R
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(function: () -> Unit) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.Center
    ) {

        Image(painter = painterResource(id = R.drawable.explore_ease),
            contentDescription = null,
        modifier = Modifier.fillMaxSize())

    }

    LaunchedEffect(null){
        delay(4000)
        function()
    }
}