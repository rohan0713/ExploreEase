package com.travel.exploreease.ui.composables

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.travel.exploreease.R
import kotlin.random.Random

@OptIn(ExperimentalFoundationApi::class)
@Preview
@Composable
fun DetailsCompose() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .fillMaxHeight()
        ) {
            item {
                Image(
                    painter = painterResource(id = R.drawable.ic_intro),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(450.dp)
                        .clip(RoundedCornerShape(bottomStart = 40.dp, bottomEnd = 40.dp)),
                    contentScale = ContentScale.Crop
                )

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp),
                    horizontalArrangement = Arrangement.spacedBy(30.dp)
                ) {

                    Row() {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_date),
                            contentDescription = null,
                            tint = Color.DarkGray
                        )

                        Text(
                            text = "5-7 days",
                            color = Color.DarkGray,
                            fontSize = 16.sp,
                            modifier = Modifier.padding(start = 5.dp, top = 3.dp)
                        )
                    }

                    Row() {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_walk),
                            contentDescription = null,
                            tint = Color.DarkGray
                        )

                        Text(
                            text = "20 km",
                            color = Color.DarkGray,
                            fontSize = 16.sp,
                            modifier = Modifier.padding(start = 5.dp, top = 3.dp)
                        )
                    }
                }

                Text(
                    text = "Glacier Hiking, Iceland",
                    modifier = Modifier.padding(start = 20.dp, end = 20.dp),
                    fontSize = 26.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = "Arctic Adventures offers glacier exploration of various length and difficulty",
                    modifier = Modifier.padding(start = 20.dp, end = 20.dp),
                    fontSize = 16.sp,
                    color = Color.Gray
                )

                Text(
                    text = "Traveler's Gallery",
                    modifier = Modifier.padding(top = 30.dp, start = 20.dp, end = 20.dp),
                    fontSize = 26.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            item {
                LazyVerticalStaggeredGrid(
                    columns = StaggeredGridCells.Fixed(2),
                    modifier = Modifier
                        .heightIn(max = 1000.dp)
                        .background(Color.White).padding(bottom = 100.dp),
                    contentPadding = PaddingValues(20.dp),
                    horizontalArrangement = Arrangement.spacedBy(5.dp),
                    verticalItemSpacing = 5.dp
                ) {
                    items(7) {
                        galleryItem()
                    }
                }
            }
        }
    }
}


@Preview
@Composable
fun galleryItem() {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(Random.nextInt(150, 300).dp)
            .background(Color.White)
            .clip(RoundedCornerShape(10.dp))
    ) {

        Image(
            painter = painterResource(id = R.drawable.ic_intro),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
    }
}