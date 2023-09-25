package com.brainhack.mvvm_test.app

import android.app.Application
import com.brainhack.mvvm_test.di.AppComponent
import com.brainhack.mvvm_test.di.AppModule
import com.brainhack.mvvm_test.di.DaggerAppComponent

class App: Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }
}