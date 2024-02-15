package com.travel.exploreease.data.models

data class GetExperiences(
    val experiences : List<Experience>
)

data class Experience(
    val description: String,
    val gallery: List<Gallery>,
    val id: Int,
    val location: String,
    val duration: String,
    val category: String,
    val poster: String,
    val rating: Double,
    val title: String,
    val trailer: String
)
