package com.estefaniasalamanca.examplemvvm.domain

import com.estefaniasalamanca.examplemvvm.data.QuoteRepository
import com.estefaniasalamanca.examplemvvm.data.model.QuoteModel

class GetQuotesUseCase {
    private val repository = QuoteRepository()

    suspend operator fun invoke(): List<QuoteModel>? = repository.getAllQuotes()

}