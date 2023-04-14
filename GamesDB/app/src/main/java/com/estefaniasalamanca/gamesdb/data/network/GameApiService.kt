package com.estefaniasalamanca.gamesdb.data.network

import com.estefaniasalamanca.gamesdb.ui.viewmodel.GameDataResponse
import com.estefaniasalamanca.gamesdb.ui.viewmodel.GameDetailResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path


interface GameApiService {

    @GET("/api/{games}+key=810cb77d13da42098dd499839649f21b")
    suspend fun getGames(@Path("games")gameName:String): Response<GameDataResponse>
    @GET("/api/games/{id}+key=810cb77d13da42098dd499839649f21b")
    suspend fun getSuperheroDetail(@Path("id") gamesId:String):Response<GameDetailResponse>


}
