package com.example.coinstatsapp_v1.data.repository

import com.example.coinstatsapp_v1.data.model.Coins
import retrofit2.Response

interface RemoteRepository {
    suspend fun getAllCoins(): Response<Coins>
}