package com.estefaniasalamanca.gamesdb.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.SearchView
import com.estefaniasalamanca.gamesdb.core.RetrofitHelper.getRetrofit
import com.estefaniasalamanca.gamesdb.data.network.GameApiService


import com.estefaniasalamanca.gamesdb.databinding.ActivityGameListBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class GameListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGameListBinding
    private lateinit var retrofit: Retrofit


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        retrofit = getRetrofit()
        initUI()
    }

    private fun initUI() {
        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                searchByName(query.orEmpty())
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                return false
            }

        })
    }

    private fun searchByName(query: String) {
        CoroutineScope(Dispatchers.IO).launch {

            val myResponse= retrofit.create(GameApiService::class.java).getGames(query)

        }
         fun getRetrofit(): Retrofit {
            return Retrofit.Builder()
                .baseUrl("https://api.rawg.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
         }

    }
}