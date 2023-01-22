package com.example.proyekakhirmobileprogramming

import android.app.Application
import com.example.proyekakhirmobileprogramming.core.di.networkModule
import com.example.proyekakhirmobileprogramming.core.di.repositoryModule
import com.project.proyek_akhir_mobile_programming.di.useCaseModule
import com.project.proyek_akhir_mobile_programming.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class BaseApplication: Application(){
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.NONE)
            androidContext(this@BaseApplication)
            modules(
                networkModule,
                repositoryModule,
                useCaseModule,
                viewModelModule
            )
        }
    }
}