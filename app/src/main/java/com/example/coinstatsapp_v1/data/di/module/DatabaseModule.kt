package com.example.coinstatsapp_v1.data.di.module

import android.content.Context
import androidx.room.Room
import com.example.coinstatsapp_v1.data.dao.CoinDao
import com.example.coinstatsapp_v1.data.database.CoinDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Provides
    @Singleton
    fun provideCoinDatabase(@ApplicationContext context: Context): CoinDatabase {
        return Room.databaseBuilder(context, CoinDatabase::class.java, "coin_db").build()
    }

    @Provides
    @Singleton
    fun provideCoinDao(db: CoinDatabase): CoinDao {
        return db.getCoinDao()
    }
}