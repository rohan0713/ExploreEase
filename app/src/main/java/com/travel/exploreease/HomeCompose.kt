package com.travel.exploreease

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.DateRange
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemColors
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeCompose(navController: NavHostController) {

    val scrollState = rememberScrollState()
    val scope = rememberCoroutineScope()
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)

    val items = mutableListOf<DrawerItem>()
    items.add(DrawerItem("home", Icons.Default.Home, Icons.Outlined.Home))
    items.add(DrawerItem("hotels", Icons.Default.DateRange, Icons.Outlined.DateRange))
    items.add(DrawerItem("experiences", Icons.Default.Search, Icons.Outlined.Search))
    items.add(DrawerItem("profile", Icons.Default.Person, Icons.Outlined.Person))

    var selectedItemIndex by rememberSaveable {
        mutableStateOf(0)
    }

    ModalNavigationDrawer(
        drawerContent = {
            ModalDrawerSheet(
                drawerContainerColor = Color.White
            ) {
                Text(text = "ExploreEase", fontSize = 28.sp, fontWeight = FontWeight.ExtraBold,
                modifier = Modifier.padding(30.dp))
                items.forEachIndexed { index, drawerItem ->
                    NavigationDrawerItem(label = { Text(text = drawerItem.title) },
                        selected = index == selectedItemIndex,
                        colors = NavigationDrawerItemDefaults.colors(
                            selectedContainerColor = colorResource(id = R.color.base),
                            unselectedContainerColor = Color.White,
                            selectedTextColor = Color.White,
                            unselectedTextColor = Color.Black,
                            selectedIconColor = Color.White,
                            unselectedIconColor = Color.Black
                        ),
                        onClick = {
                            selectedItemIndex = index
                            scope.launch {
                                drawerState.close()
                            }
                        },
                        icon = {
                            Icon(
                                imageVector = if (index == selectedItemIndex) {
                                    drawerItem.selectedIcon
                                } else drawerItem.notSelectedIcon,
                                contentDescription = drawerItem.title
                            )
                        }, modifier = Modifier.padding(start = 20.dp, end = 20.dp))
                }
            }
        },
        drawerState = drawerState
    ) {

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(top = 30.dp, bottom = 30.dp)
        ) {

            Column(modifier = Modifier.verticalScroll(scrollState, enabled = true)) {

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    IconButton(
                        onClick = {
                            scope.launch {
                                drawerState.open()
                            }
                        },
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
                            ).clickable {
                                        navController.navigate("profile")
                            },
                        contentScale = ContentScale.Crop,
                    )

                }

                val sentence = "Hello, What are you looking for?"
                val colorWord = "Hello"

                val annotatedString = buildAnnotatedString {
                    append(sentence)

                    // Add a span for the colored word
                    addStyle(
                        style = SpanStyle(
                            color = colorResource(R.color.base),
                            fontWeight = FontWeight.Bold
                        ),
                        start = sentence.indexOf(colorWord),
                        end = sentence.indexOf(colorWord) + colorWord.length
                    )
                }

                Text(
                    text = annotatedString,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(25.dp),
                    style = TextStyle(
                        fontSize = 40.sp,
                        fontWeight = FontWeight.Bold,
                    ),
                    color = Color.DarkGray
                )

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 30.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {

                    Column(
                        modifier = Modifier.wrapContentSize(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        IconButton(
                            onClick = {},
                            modifier = Modifier
                                .wrapContentSize()
                                .clip(RoundedCornerShape(percent = 20))
                                .background(colorResource(id = R.color.base))
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

                    Column(
                        modifier = Modifier.wrapContentSize(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        IconButton(
                            onClick = {},
                            modifier = Modifier
                                .wrapContentSize()
                                .clip(RoundedCornerShape(percent = 20))
                                .background(colorResource(id = R.color.base))
                                .padding(5.dp)
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_experience),
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

                    Column(
                        modifier = Modifier.wrapContentSize(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        IconButton(
                            onClick = {},
                            modifier = Modifier
                                .wrapContentSize()
                                .clip(RoundedCornerShape(percent = 20))
                                .background(colorResource(id = R.color.base))
                                .padding(5.dp)
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_adventure),
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

                    Column(
                        modifier = Modifier.wrapContentSize(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        IconButton(
                            onClick = {},
                            modifier = Modifier
                                .wrapContentSize()
                                .clip(RoundedCornerShape(percent = 20))
                                .background(colorResource(id = R.color.base))
                                .padding(5.dp)
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_flight),
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
                        modifier = Modifier
                            .padding(20.dp)
                            .size(40.dp)
                    )

                }

                LazyRow(content = {
                    items(5) {
                        ExperienceItem() {
                            navController.navigate("details")
                        }
                    }
                }, modifier = Modifier.padding(start = 10.dp))
            }
        }
    }
}

@Composable
fun ExperienceItem(onClick: () -> Unit) {

    Box(
        modifier = Modifier
            .width(280.dp)
            .height(400.dp)
            .background(Color.White)
            .clickable {
                onClick()
            }
    ) {

        Image(
            painter = painterResource(id = R.drawable.ic_intro),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp)
                .clip(RoundedCornerShape(30.dp)),
            contentScale = ContentScale.Crop
        )

        Box(modifier = Modifier.fillMaxSize()) {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .align(Alignment.BottomStart)
            ) {

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(25.dp)
                ) {

                    Text(
                        text = "The Golden Circle, Iceland",
                        color = Color.White,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 10.dp),
                        horizontalArrangement = Arrangement.spacedBy(30.dp)
                    ) {

                        Row() {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_date),
                                contentDescription = null,
                                tint = Color.White
                            )

                            Text(
                                text = "5-7 days",
                                color = Color.White,
                                fontSize = 16.sp,
                                modifier = Modifier.padding(start = 5.dp, top = 3.dp)
                            )
                        }

                        Row() {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_walk),
                                contentDescription = null,
                                tint = Color.White
                            )

                            Text(
                                text = "20 km",
                                color = Color.White,
                                fontSize = 16.sp,
                                modifier = Modifier.padding(start = 5.dp, top = 3.dp)
                            )
                        }
                    }
                }
            }
        }
    }
}