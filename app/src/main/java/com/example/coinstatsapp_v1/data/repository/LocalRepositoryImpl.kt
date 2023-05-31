package com.example.coinstatsapp_v1.data.repository

import com.example.coinstatsapp_v1.data.dao.CoinDao
import com.example.coinstatsapp_v1.data.model.CoinModel
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

class LocalRepositoryImpl @Inject constructor(private val dao:CoinDao):LocalRepository {
    override suspend fun addFavoriteCoin(coin: CoinModel) {
        dao.addCoin(coin)
    }

    override suspend fun deleteFavoriteCoin(coin: CoinModel) {
        dao.deleteCoin(coin)
    }

    override suspend fun getAllFavoriteCoin(): List<CoinModel> {
        return dao.getAllCoins()
    }
}