package com.estefaniasalamanca.examplemvvm.domain

import com.estefaniasalamanca.examplemvvm.data.QuoteRepository
import com.estefaniasalamanca.examplemvvm.data.database.entities.toDatabase
import com.estefaniasalamanca.examplemvvm.data.model.QuoteModel
import com.estefaniasalamanca.examplemvvm.domain.model.Quote
import javax.inject.Inject

class GetQuotesUseCase @Inject constructor(private val repository: QuoteRepository) {

    suspend operator fun invoke(): List<Quote>{
        val quotes =repository.getAllQuotesFromApi()
        return if (quotes.isNotEmpty()){
            repository.clearQuotes()
            repository.insertQuotes(quotes.map { it.toDatabase() })
            quotes

        }else{
            repository.getAllQuotesFromDatabase()
        }
    }

}