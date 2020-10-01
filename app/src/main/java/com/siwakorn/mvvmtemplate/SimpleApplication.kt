package com.siwakorn.mvvmtemplate

import android.app.Application
import com.siwakorn.mvvmtemplate.di.applicationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class SimpleApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@SimpleApplication)
            modules(applicationModule)
        }
    }
}