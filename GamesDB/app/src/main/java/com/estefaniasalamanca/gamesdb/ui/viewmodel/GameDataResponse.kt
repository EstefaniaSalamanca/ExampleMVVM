package com.estefaniasalamanca.gamesdb.ui.viewmodel

import com.google.gson.annotations.SerializedName

data class GameDataResponse(@SerializedName("count") val count: Int,
    @SerializedName("results") val games: List<GameItemResponse>)

data class GameItemResponse(@SerializedName("id") val GameId: String,
                            @SerializedName("name") val name: String,
                            @SerializedName("background_image") val GameImage:GameImageResponse
)
data class GameImageResponse(@SerializedName("url") val url:String)
