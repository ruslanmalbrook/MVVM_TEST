package com.brainhack.mvvm_test.di

import com.brainhack.mvvm_test.data.repositories.UserRepositoryImpl
import com.brainhack.mvvm_test.domain.repositories.UserRepository
import com.brainhack.mvvm_test.domain.usecases.GetUserNameUseCase
import com.brainhack.mvvm_test.domain.usecases.SaveUserNameUseCase
import dagger.Module
import dagger.Provides

@Module
class DomainModule {

//    @Provides
//    fun provideUserDataUseCase(userRepository: UserRepository): GetUserNameUseCase {
//        return GetUserNameUseCase(
//            userRepository = userRepository
//        )
//    }
//
//    @Provides
//    fun provideSaveUserDataUseCase(userRepository: UserRepository): SaveUserNameUseCase {
//        return SaveUserNameUseCase(
//            userRepository = userRepository
//        )
//    }
}