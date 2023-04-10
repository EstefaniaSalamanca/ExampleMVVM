package com.estefaniasalamanca.examplemvvm.data

import com.estefaniasalamanca.examplemvvm.data.model.QuoteModel
import com.estefaniasalamanca.examplemvvm.data.model.QuoteProvider
import com.estefaniasalamanca.examplemvvm.data.network.QuoteService

class QuoteRepository {
    private val api = QuoteService()

    suspend fun getAllQuotes():List<QuoteModel>{
        val response = api.getQuotes()
        QuoteProvider.quotes = response
        return response
    }

}