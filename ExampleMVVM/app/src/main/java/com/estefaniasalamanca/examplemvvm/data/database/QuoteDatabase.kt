package com.estefaniasalamanca.examplemvvm.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.estefaniasalamanca.examplemvvm.data.database.dao.QuoteDao
import com.estefaniasalamanca.examplemvvm.data.database.entities.QuoteEntity

@Database(entities = [QuoteEntity::class], version = 1)

abstract class QuoteDatabase : RoomDatabase() {

    abstract fun getQuoteDao(): QuoteDao

}