package com.travel.exploreease.data.models

data class GetCafes(
    val cafes: List<Data>
)

data class Data(
    val description: String,
    val gallery: List<Gallery>,
    val id: Int,
    val location: String,
    val poster: String,
    val rating: Double,
    val title: String,
    val trailer: String
)

data class Gallery(
    val image: String
)