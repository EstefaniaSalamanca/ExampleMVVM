package com.estefaniasalamanca.examplemvvm.data

import com.estefaniasalamanca.examplemvvm.data.database.dao.QuoteDao
import com.estefaniasalamanca.examplemvvm.data.database.entities.QuoteEntity
import com.estefaniasalamanca.examplemvvm.data.network.QuoteService
import com.estefaniasalamanca.examplemvvm.domain.model.Quote
import com.estefaniasalamanca.examplemvvm.domain.model.toDomain
import javax.inject.Inject

class QuoteRepository @Inject constructor(
    private val api: QuoteService,
    private val quoteDao: QuoteDao

) {

    suspend fun getAllQuotesFromApi(): List<Quote> {
        val response = api.getQuotes()
        return response.map { it.toDomain() }
    }

    suspend fun getAllQuotesFromDatabase(): List<Quote> {
        val response = quoteDao.getAllQuotes()
        return response.map { it.toDomain() }

    }

    suspend fun insertQuotes(quotes: List<QuoteEntity>) {

    }
    suspend fun clearQuotes(){
        quoteDao.deleteAllQuotes()
    }

}