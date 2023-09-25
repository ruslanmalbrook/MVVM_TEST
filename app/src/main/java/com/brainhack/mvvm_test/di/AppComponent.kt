package com.brainhack.mvvm_test.di

import com.brainhack.mvvm_test.presentation.ui.fragments.MainFragment
import dagger.Component

@Component(modules = [AppModule::class, DomainModule::class, DataModule::class])
interface AppComponent {
    fun inject(mainFragment: MainFragment)
}