package com.estefaniasalamanca.gamesdb.ui.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.estefaniasalamanca.gamesdb.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGoIn.setOnClickListener { navigateToGameList() }

    }

    private fun navigateToGameList() {
        val intent = Intent(this, GameListActivity::class.java)
        startActivity(intent)
    }
}





