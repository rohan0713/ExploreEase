package com.travel.exploreease.ui.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.travel.exploreease.R

@Composable
fun IntroCompose(onClick: () -> Unit) {

    Box(modifier = Modifier.fillMaxSize()) {

        Image(
            painter = painterResource(id = R.drawable.ic_intro),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Box(
            modifier = Modifier.fillMaxSize(),
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp)
                    .align(Alignment.BottomStart),
            ) {

                Column(modifier = Modifier.fillMaxWidth()) {

                    Text(
                        text = "Explore the world",
                        modifier = Modifier.fillMaxWidth(),
                        color = Color.White,
                        style = MaterialTheme.typography.displayMedium,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.ExtraBold
                    )

                    Text(
                        text = "We will help you find the best experiences and adventures",
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp),
                        color = Color.White,
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center,
                    )

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 20.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        IconButton(
                            onClick = {
                                onClick()
                            },
                            modifier = Modifier
                                .wrapContentSize()
                                .clip(RoundedCornerShape(percent = 20))
                                .background(Color.White)
                                .padding(10.dp)
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_arrow),
                                contentDescription = null,
                                tint = Color.Black,
                                modifier = Modifier.size(20.dp)
                            )
                        }

                    }
                }
            }
        }
    }

}