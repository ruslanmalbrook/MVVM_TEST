package com.brainhack.mvvm_test.di

import com.brainhack.mvvm_test.data.repositories.UserRepositoryImpl
import com.brainhack.mvvm_test.data.storage.UserStorage
import com.brainhack.mvvm_test.data.storage.sharedprefs.SharedPrefsUserStorage
import com.brainhack.mvvm_test.domain.repositories.UserRepository
import org.koin.dsl.module

val dataModule = module {

    single<UserStorage> {
        SharedPrefsUserStorage(context = get())
    }

    single<UserRepository> {
        UserRepositoryImpl(userStorage = get())
    }
}