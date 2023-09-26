package com.brainhack.mvvm_test.di

import com.brainhack.mvvm_test.domain.repositories.UserRepository
import com.brainhack.mvvm_test.domain.usecases.GetUserNameUseCase
import com.brainhack.mvvm_test.domain.usecases.SaveUserNameUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(ViewModelComponent::class)
class DomainModule {

    @Provides

    fun provideGetUserNameUseCase(userRepository: UserRepository): GetUserNameUseCase =
        GetUserNameUseCase(userRepository = userRepository)

    @Provides
    fun provideSetUserNameUseCase(userRepository: UserRepository): SaveUserNameUseCase =
        SaveUserNameUseCase(userRepository = userRepository)
}