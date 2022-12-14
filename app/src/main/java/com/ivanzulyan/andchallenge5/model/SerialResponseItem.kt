package com.ivanzulyan.andchallenge5.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class SerialResponseItem(
    @SerializedName("original_name")
    val originalName: String,
    @SerializedName("poster_path")
    val posterPath: String,
    @SerializedName("vote_average")
    val voteAverage: Double,
    @SerializedName("overview")
    val overview: String,
): Serializable