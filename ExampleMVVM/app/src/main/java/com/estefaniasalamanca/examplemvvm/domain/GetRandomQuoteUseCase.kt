package com.estefaniasalamanca.examplemvvm.domain

import com.estefaniasalamanca.examplemvvm.data.QuoteRepository
import com.estefaniasalamanca.examplemvvm.data.model.QuoteModel
import com.estefaniasalamanca.examplemvvm.data.model.QuoteProvider


class GetRandomQuoteUseCase {

    operator fun invoke():QuoteModel?{
        val quotes: List<QuoteModel> = QuoteProvider.quotes
        if(!quotes.isNullOrEmpty()){
            val randomNumber: Int =(0..quotes.size-1).random()
            return quotes[randomNumber]
        }
        return null
    }
}