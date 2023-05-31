package com.example.coinstatsapp_v1.data.dao

import androidx.room.*
import com.example.coinstatsapp_v1.data.model.CoinModel

@Dao
interface CoinDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addCoin(coin: CoinModel)

    @Delete
    suspend fun deleteCoin(coin: CoinModel)

    @Update
    suspend fun updateCoin(coin: CoinModel)

    @Query("SELECT * FROM _coins_table")
    suspend fun getAllCoins(): List<CoinModel>
}