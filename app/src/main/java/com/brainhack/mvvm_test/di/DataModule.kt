package com.brainhack.mvvm_test.di

import android.content.Context
import com.brainhack.mvvm_test.data.repositories.UserRepositoryImpl
import com.brainhack.mvvm_test.data.storage.UserStorage
import com.brainhack.mvvm_test.data.storage.sharedprefs.SharedPrefsUserStorage
import com.brainhack.mvvm_test.domain.repositories.UserRepository
import dagger.Module
import dagger.Provides

@Module
class DataModule {

    @Provides
    fun provideUserStorage(context: Context): UserStorage {
        return SharedPrefsUserStorage(context = context)
    }

    @Provides
    fun provideUserRepository(userStorage: UserStorage): UserRepository {
        return UserRepositoryImpl(
            userStorage = userStorage
        )
    }
}