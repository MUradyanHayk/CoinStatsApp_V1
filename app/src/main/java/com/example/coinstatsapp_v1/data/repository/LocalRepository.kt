package com.example.coinstatsapp_v1.data.repository

import com.example.coinstatsapp_v1.data.model.CoinModel

interface LocalRepository {
    suspend fun addFavoriteCoin(coin: CoinModel)
    suspend fun deleteFavoriteCoin(coin: CoinModel)
    suspend fun getAllFavoriteCoin(): List<CoinModel>
}