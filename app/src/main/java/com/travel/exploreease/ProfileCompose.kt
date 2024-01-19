package com.travel.exploreease

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun ProfileCompose() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = colorResource(id = R.color.base))
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(450.dp)
                .background(colorResource(id = R.color.base))
                .padding(top = 40.dp)
        ) {

            Column() {

                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp)
                ) {

                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        tint = Color.White,
                        contentDescription = null,
                        modifier = Modifier.size(30.dp)
                    )
                    Icon(
                        imageVector = Icons.Default.ExitToApp,
                        tint = Color.White, contentDescription = null,
                        modifier = Modifier
                            .size(30.dp)
                            .rotate(180f)
                    )
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp)
                ) {

                    Image(
                        painter = painterResource(id = R.drawable.ic_intro),
                        contentDescription = null,
                        modifier = Modifier
                            .size(120.dp)
                            .border(2.dp, Color.LightGray, shape = CircleShape)
                            .clip(CircleShape),
                        contentScale = ContentScale.Crop
                    )

                    Column() {

                        Text(
                            text = "Louis Saville",
                            color = Color.White,
                            fontSize = 28.sp,
                            modifier = Modifier.padding(start = 30.dp, top = 20.dp),
                            fontWeight = FontWeight.ExtraBold
                        )

                        Text(
                            text = "Young and passionate rider",
                            color = Color.White,
                            fontSize = 16.sp,
                            modifier = Modifier.padding(start = 30.dp),
                        )
                    }
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 20.dp, end = 20.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    Row(modifier = Modifier.padding(10.dp)) {
                        Icon(
                            imageVector = Icons.Default.LocationOn, contentDescription = null,
                            tint = Color.White
                        )
                        Text(
                            text = "Austria",
                            color = Color.White,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(start = 5.dp),
                        )
                    }

                    Box(
                        modifier = Modifier
                            .wrapContentSize()
                            .border(
                                2.dp, Color.White, shape = RoundedCornerShape(20.dp)
                            )
                            .padding(3.dp)
                    ) {

                        Row() {

                            Icon(
                                imageVector = Icons.Default.Add, contentDescription = null,
                                tint = Color.White,
                                modifier = Modifier.padding(
                                    start = 15.dp,
                                    top = 5.dp,
                                    bottom = 5.dp
                                )
                            )
                            Text(
                                text = "Follow",
                                color = Color.White,
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(
                                    start = 5.dp,
                                    end = 15.dp,
                                    top = 5.dp,
                                    bottom = 5.dp
                                ),
                            )
                        }
                    }

                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(25.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    Column(
                        modifier = Modifier
                            .wrapContentSize()
                            .padding(10.dp)
                    ) {

                        Text(
                            text = "3420", fontWeight = FontWeight.ExtraBold,
                            color = Color.White,
                            fontSize = 24.sp
                        )

                        Text(
                            text = "POSTS",
                            color = Color.LightGray,
                            fontSize = 16.sp
                        )
                    }

                    Column(
                        modifier = Modifier
                            .wrapContentSize()
                            .padding(10.dp)
                    ) {

                        Text(
                            text = "461", fontWeight = FontWeight.ExtraBold,
                            color = Color.White,
                            fontSize = 24.sp
                        )

                        Text(
                            text = "FOLLOWING",
                            color = Color.LightGray,
                            fontSize = 16.sp
                        )
                    }

                    Column(
                        modifier = Modifier
                            .wrapContentSize()
                            .padding(10.dp)
                    ) {

                        Text(
                            text = "348", fontWeight = FontWeight.ExtraBold,
                            color = Color.White,
                            fontSize = 24.sp
                        )

                        Text(
                            text = "FOLLOWERS",
                            color = Color.LightGray,
                            fontSize = 16.sp
                        )
                    }

                }

            }
        }


        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(550.dp)
                .clip(RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp))
                .background(Color.White)
        ) {

            Column {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 30.dp, start = 20.dp, end = 20.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    Text(
                        text = "Settings and Privacy",
                        color = Color.DarkGray,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Icon(imageVector = Icons.Default.Settings, contentDescription = null)

                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 30.dp, start = 20.dp, end = 20.dp),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {

                    Icon(imageVector = Icons.Default.AccountCircle, contentDescription = null)

                    Text(
                        text = "Account Center",
                        fontSize = 18.sp,
                        color = Color.DarkGray
                    )

                }

                Divider(
                    modifier = Modifier.padding(20.dp),
                    color = Color.LightGray
                )


                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp, start = 20.dp, end = 20.dp),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {

                    Icon(imageVector = Icons.Default.Notifications, contentDescription = null)

                    Text(
                        text = "Notifications",
                        fontSize = 18.sp,
                        color = Color.DarkGray
                    )

                }

                Divider(
                    modifier = Modifier.padding(20.dp),
                    color = Color.LightGray
                )

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp, start = 20.dp, end = 20.dp),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {

                    Icon(imageVector = Icons.Default.Search, contentDescription = null)

                    Text(
                        text = "Help",
                        fontSize = 18.sp,
                        color = Color.DarkGray
                    )

                }

                Divider(
                    modifier = Modifier.padding(20.dp),
                    color = Color.LightGray
                )

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp, start = 20.dp, end = 20.dp),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {

                    Icon(imageVector = Icons.Default.Info, contentDescription = null)

                    Text(
                        text = "About",
                        fontSize = 18.sp,
                        color = Color.DarkGray
                    )

                }
            }

        }
    }
}