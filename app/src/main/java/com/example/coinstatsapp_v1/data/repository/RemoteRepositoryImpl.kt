package com.example.coinstatsapp_v1.data.repository

import com.example.coinstatsapp_v1.data.model.CoinModel
import com.example.coinstatsapp_v1.data.model.Coins
import com.example.coinstatsapp_v1.data.network.retrofit.CoinsApi
import dagger.hilt.android.scopes.ViewModelScoped
import retrofit2.Response
import javax.inject.Inject

class RemoteRepositoryImpl @Inject constructor(private val api:CoinsApi): RemoteRepository {
    override suspend fun getAllCoins(): Response<Coins> {
        return api.getCoins()
    }
}