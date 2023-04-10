package com.estefaniasalamanca.examplemvvm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.estefaniasalamanca.examplemvvm.databinding.ActivityMainBinding
import com.estefaniasalamanca.examplemvvm.viewmodel.QuoteViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    private val quoteViewModel:QuoteViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        quoteViewModel.quoteModel.observe(this, Observer{ currenteQuote ->
            binding.tvQuote.text = currenteQuote.quote
            binding.tvAuthor.text = currenteQuote.author
        })

        binding.viewContainer.setOnClickListener { quoteViewModel.randomQuote()}
    }
}