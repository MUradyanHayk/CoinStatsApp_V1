package com.example.coinstatsapp_v1.data.di.module

import com.example.coinstatsapp_v1.data.repository.RemoteRepository
import com.example.coinstatsapp_v1.data.repository.RemoteRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RemoteRepositoryModule {

    @Provides
    @Singleton
    fun provideRemoteRepository(repo: RemoteRepositoryImpl): RemoteRepository {
        return repo
    }
}