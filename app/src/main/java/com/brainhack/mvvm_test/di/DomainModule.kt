package com.brainhack.mvvm_test.di

import com.brainhack.mvvm_test.domain.usecases.GetUserNameUseCase
import com.brainhack.mvvm_test.domain.usecases.SaveUserNameUseCase
import org.koin.dsl.module

val domainModule = module {

     factory<GetUserNameUseCase> {
         GetUserNameUseCase(userRepository = get())
     }

    factory<SaveUserNameUseCase> {
        SaveUserNameUseCase(userRepository = get())
    }
}