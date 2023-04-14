package com.estefaniasalamanca.gamesdb.ui.viewmodel

import com.google.gson.annotations.SerializedName

data class GameDetailResponse(@SerializedName("name") val name: String,
                              @SerializedName("description") val description: String
                              )
