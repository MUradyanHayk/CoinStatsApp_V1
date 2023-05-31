package com.example.coinstatsapp_v1.data.repository

import com.example.coinstatsapp_v1.data.model.CoinModel
import com.example.coinstatsapp_v1.data.model.Coins
import retrofit2.Response
import javax.inject.Inject

class CoinRepository @Inject constructor(
    private val localRepository: LocalRepository,
    private val remoteRepository: RemoteRepository
) {
    suspend fun addCoin(coin: CoinModel) {

    }

    suspend fun getAllCoins():Response<Coins> {
        return remoteRepository.getAllCoins()
    }
}