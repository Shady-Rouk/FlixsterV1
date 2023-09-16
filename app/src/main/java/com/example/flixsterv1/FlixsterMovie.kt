package com.example.flixsterv1

import com.google.gson.annotations.SerializedName

/**
 * The Model for storing a single movie from the Movie Database API.
 */
class FlixsterMovie {
    @JvmField
    @SerializedName("title")
    var title: String? = null

    @SerializedName("overview")
    var description: String? = null

    @SerializedName("poster_path")
    var movieImageUrl: String? = null

}