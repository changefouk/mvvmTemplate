package com.siwakorn.mvvmtemplate.di

import android.app.Application
import androidx.room.Room
import com.siwakorn.mvvmtemplate.data.database.SimpleDao
import com.appsynthassignment.data.database.SimpleDatabase
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

private fun provideDatabase(application: Application): SimpleDatabase {
    return Room.databaseBuilder(application, SimpleDatabase::class.java, "simple_database")
        .fallbackToDestructiveMigration()
        .build()
}

private fun provideCountriesDao(database: SimpleDatabase): SimpleDao {
    return database.simpleDao
}

val dataBaseModule = module {
    single { provideDatabase(androidApplication()) }
    single { provideCountriesDao(get()) }
}