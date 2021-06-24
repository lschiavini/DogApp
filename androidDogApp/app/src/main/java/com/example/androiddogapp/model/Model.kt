package com.example.androiddogapp.model

import com.google.gson.annotations.SerializedName

data class DogBreed(
//    val name: String?, if attribute matches the name got from server, no need for @SerializedName

    @SerializedName("id")
    val breedId: String?,

    @SerializedName("name")
    val dogBreed: String?,

    @SerializedName("life_span")
    val lifeSpan: String?,

    @SerializedName("breed_group")
    val breedGroup: String?,

    @SerializedName("bred_for")
    val bredFor: String?,

    @SerializedName("temperament")
    val temperament: String?,

    @SerializedName("url")
    val imageUrl: String?
)
