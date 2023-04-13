package com.estefaniasalamanca.gamesdb.data.network

import com.estefaniasalamanca.gamesdb.ui.viewmodel.GameDataCount
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path


interface GameApiClient {

    @GET("/api/{games}?key=810cb77d13da42098dd499839649f21b")
    suspend fun getGames(@Path("games") gamesName: String): Response<GameDataCount>

}