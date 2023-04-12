package com.estefaniasalamanca.examplemvvm.domain

import com.estefaniasalamanca.examplemvvm.data.QuoteRepository
import com.estefaniasalamanca.examplemvvm.data.model.QuoteModel
import com.estefaniasalamanca.examplemvvm.domain.model.Quote
import javax.inject.Inject


class GetRandomQuoteUseCase @Inject constructor(private val repository: QuoteRepository) {

    suspend operator fun invoke(): Quote?{
        val quotes = repository.getAllQuotesFromDatabase()
        if(!quotes.isNullOrEmpty()){
            val randomNumber: Int =(0..quotes.size-1).random()
            return quotes[randomNumber]
        }
        return null
    }
}