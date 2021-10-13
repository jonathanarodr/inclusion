package br.com.inclusion

import android.app.Application
import br.com.inclusion.di.sampleModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        initDependencyInjection()
    }

    private fun initDependencyInjection() {
        startKoin {
            androidContext(this@MainApplication)
            modules(sampleModule)
        }
    }
}