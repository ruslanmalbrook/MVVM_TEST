package com.brainhack.mvvm_test.di

import android.content.Context
import com.brainhack.mvvm_test.domain.usecases.GetUserNameUseCase
import com.brainhack.mvvm_test.domain.usecases.SaveUserNameUseCase
import com.brainhack.mvvm_test.presentation.ui.fragments.MainFragmentViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class AppModule(val context: Context) {

    @Provides
    fun provideContext(): Context {
        return context
    }

//    @Provides
//    fun provideMainFragmentViewModelFactory(
//        getUserNameUseCase: GetUserNameUseCase,
//        saveUserNameUseCase: SaveUserNameUseCase
//    ): MainFragmentViewModelFactory {
//
//        return MainFragmentViewModelFactory(
//            getUserNameUseCase = getUserNameUseCase,
//            saveUserNameUseCase = saveUserNameUseCase
//        )
//    }
}