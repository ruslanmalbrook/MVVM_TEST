package com.brainhack.mvvm_test.di

import android.content.Context
import com.brainhack.mvvm_test.data.repositories.UserRepositoryImpl
import com.brainhack.mvvm_test.data.storage.UserStorage
import com.brainhack.mvvm_test.data.storage.sharedprefs.SharedPrefsUserStorage
import com.brainhack.mvvm_test.domain.repositories.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataModule {

    @Provides
    @Singleton
    fun provideUserStorage(@ApplicationContext context: Context): UserStorage =
        SharedPrefsUserStorage(context = context)

    @Provides
    @Singleton
    fun provideUserRepository(userStorage: UserStorage): UserRepository =
        UserRepositoryImpl(userStorage = userStorage)
}