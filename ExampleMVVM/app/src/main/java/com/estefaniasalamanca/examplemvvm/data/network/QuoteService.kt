package com.estefaniasalamanca.examplemvvm.data.network

import com.estefaniasalamanca.examplemvvm.core.RetrofitHelper
import com.estefaniasalamanca.examplemvvm.data.model.QuoteModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response
import javax.inject.Inject

class QuoteService @Inject constructor(private val api: QuoteApiClient) {

    suspend fun getQuotes(): List<QuoteModel> {
        return withContext(Dispatchers.IO) {
            val response = api.getAllQuotes()
            response.body() ?: emptyList()
        }

    }

}