package com.brainhack.mvvm_test.di

import com.brainhack.mvvm_test.presentation.ui.fragments.MainFragmentViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel<MainFragmentViewModel> {
        MainFragmentViewModel(getUserDataUseCase = get(), setUserDataUseCase = get())
    }
}