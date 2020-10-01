package com.siwakorn.mvvmtemplate.di

import com.siwakorn.mvvmtemplate.ui.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { MainViewModel() }
}

val applicationModule = listOf(
    networkModule, dataBaseModule,
    useCaseModule, repositoryModule,
    viewModelModule
)