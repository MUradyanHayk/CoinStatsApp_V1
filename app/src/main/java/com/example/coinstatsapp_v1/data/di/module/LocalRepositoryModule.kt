package com.example.coinstatsapp_v1.data.di.module

import com.example.coinstatsapp_v1.data.repository.LocalRepository
import com.example.coinstatsapp_v1.data.repository.LocalRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object LocalRepositoryModule {

    @Provides
    @Singleton
    fun provideLocalRepository(repo: LocalRepositoryImpl): LocalRepository {
        return repo
    }
}