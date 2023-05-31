package com.example.coinstatsapp_v1.data.network.retrofit

import com.example.coinstatsapp_v1.data.model.CoinModel
import com.example.coinstatsapp_v1.data.model.Coins
import retrofit2.Response
import retrofit2.http.GET

interface CoinsApi {
    @GET("/public/v1/coins?skip=0&limit=35&currency=EUR")
    suspend fun getCoins(): Response<Coins>
}