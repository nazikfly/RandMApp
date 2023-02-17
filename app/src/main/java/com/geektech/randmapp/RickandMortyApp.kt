package com.geektech.randmapp

import android.app.Application
import com.geektech.randmapp.di.appModule
import com.geektech.randmapp.di.dataModule
import com.geektech.randmapp.di.networkModule
import domainModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level


class RickAndMortyApp: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin{
            androidLogger(Level.DEBUG)
            androidContext(this@RickAndMortyApp)
            modules(listOf(appModule, dataModule, domainModule, networkModule))
        }
    }

}