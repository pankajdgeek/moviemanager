package com.pankaj.moviemanager

import android.app.Application
import com.pankaj.core.framework.di.localStoreModule
import com.pankaj.core.framework.network.networkModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MovieManagerApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        initDi()
    }

    private fun initDi() {
        startKoin {
            androidLogger()
            androidContext(this@MovieManagerApplication)
            modules(listOf(networkModule, localStoreModule))
        }
    }
}