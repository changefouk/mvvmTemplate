package com.siwakorn.mvvmtemplate.di

import com.siwakorn.mvvmtemplate.data.repository.*
import org.koin.dsl.module

val repositoryModule = module {
    single<RemoteDataSource> { RemoteDataSourceImp(get()) }
    single<LocalDataSource> { LocalDataSourceImp() }
    single<DataRepository> { DataRepositoryImp(get(), get()) }
}