package com.brainhack.mvvm_test.app

import android.app.Application
import com.brainhack.mvvm_test.di.appModule
import com.brainhack.mvvm_test.di.dataModule
import com.brainhack.mvvm_test.di.domainModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class App: Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@App)
            modules(listOf(appModule, domainModule, dataModule))
        }
    }
}