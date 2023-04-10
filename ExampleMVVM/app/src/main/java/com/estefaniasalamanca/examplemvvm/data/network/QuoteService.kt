package com.estefaniasalamanca.examplemvvm.data.network

import com.estefaniasalamanca.examplemvvm.core.RetrofitHelper
import com.estefaniasalamanca.examplemvvm.data.model.QuoteModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

class QuoteService {
    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getQuotes():List<QuoteModel>{
        return withContext(Dispatchers.IO){
            val response = retrofit.create(QuoteApiClient::class.java).getAllQuotes()
            response.body()?: emptyList()
        }

    }

}