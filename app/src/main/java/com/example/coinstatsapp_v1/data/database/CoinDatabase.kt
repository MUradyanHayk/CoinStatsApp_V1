package com.example.coinstatsapp_v1.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.coinstatsapp_v1.data.dao.CoinDao
import com.example.coinstatsapp_v1.data.model.CoinModel

@Database(entities = [CoinModel::class], version = 1)
abstract class CoinDatabase : RoomDatabase() {
    abstract fun getCoinDao(): CoinDao
}