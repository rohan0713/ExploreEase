package com.travel.exploreease

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = false)
@Composable
fun HomeCompose() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White).padding(top = 30.dp)
    ) {

        Column {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                IconButton(
                    onClick = {},
                    modifier = Modifier
                        .wrapContentSize()
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_menu),
                        contentDescription = null,
                        modifier = Modifier.size(40.dp),
                        tint = Color.DarkGray
                    )
                }

                Image(
                    painter = painterResource(id = R.drawable.ic_intro),
                    contentDescription = null,
                    modifier = Modifier
                        .size(50.dp)
                        .padding(5.dp)
                        .graphicsLayer(
                            clip = true,
                            shape = MaterialTheme.shapes.extraLarge
                        ),
                    contentScale = ContentScale.Crop,
                )

            }

            Text(
                text = "Hello, What are you looking for?",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(25.dp),
                style = TextStyle(
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Bold,
                ),
                color = Color.DarkGray
            )

            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp),
            horizontalArrangement = Arrangement.SpaceEvenly) {

                Column(modifier = Modifier.wrapContentSize(),
                horizontalAlignment = Alignment.CenterHorizontally) {

                    IconButton(
                        onClick = {},
                        modifier = Modifier
                            .wrapContentSize()
                            .clip(RoundedCornerShape(percent = 20))
                            .background(MaterialTheme.colorScheme.primary)
                            .padding(5.dp)
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_home),
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(20.dp)
                        )
                    }

                    Text(
                        text = "Hotels",
                        modifier = Modifier
                            .wrapContentSize()
                            .padding(top = 10.dp),
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                        ),
                        color = Color.DarkGray
                    )
                }

                Column(modifier = Modifier.wrapContentSize(),
                    horizontalAlignment = Alignment.CenterHorizontally) {

                    IconButton(
                        onClick = {},
                        modifier = Modifier
                            .wrapContentSize()
                            .clip(RoundedCornerShape(percent = 20))
                            .background(MaterialTheme.colorScheme.primary)
                            .padding(5.dp)
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_home),
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(20.dp)
                        )
                    }

                    Text(
                        text = "Experiences",
                        modifier = Modifier
                            .wrapContentSize()
                            .padding(top = 10.dp),
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                        ),
                        color = Color.DarkGray
                    )
                }

                Column(modifier = Modifier.wrapContentSize(),
                    horizontalAlignment = Alignment.CenterHorizontally) {

                    IconButton(
                        onClick = {},
                        modifier = Modifier
                            .wrapContentSize()
                            .clip(RoundedCornerShape(percent = 20))
                            .background(MaterialTheme.colorScheme.primary)
                            .padding(5.dp)
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_home),
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(20.dp)
                        )
                    }

                    Text(
                        text = "Adventures",
                        modifier = Modifier
                            .wrapContentSize()
                            .padding(top = 10.dp),
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                        ),
                        color = Color.DarkGray
                    )
                }

                Column(modifier = Modifier.wrapContentSize(),
                    horizontalAlignment = Alignment.CenterHorizontally) {

                    IconButton(
                        onClick = {},
                        modifier = Modifier
                            .wrapContentSize()
                            .clip(RoundedCornerShape(percent = 20))
                            .background(MaterialTheme.colorScheme.primary)
                            .padding(5.dp)
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_home),
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(20.dp)
                        )
                    }

                    Text(
                        text = "Flights",
                        modifier = Modifier
                            .wrapContentSize()
                            .padding(top = 10.dp),
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                        ),
                        color = Color.DarkGray
                    )
                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Text(
                    text = "Best Experiences",
                    modifier = Modifier
                        .wrapContentSize()
                        .padding(25.dp),
                    style = TextStyle(
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Bold,
                    ),
                    color = Color.DarkGray
                )

                Image(
                    painter = painterResource(id = R.drawable.ic_options),
                    contentDescription = null,
                    modifier = Modifier.padding(20.dp)
                        .size(40.dp)
                )

            }
        }
    }

}