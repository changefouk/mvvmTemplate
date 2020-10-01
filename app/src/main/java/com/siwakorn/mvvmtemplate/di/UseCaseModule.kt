package com.siwakorn.mvvmtemplate.di

import com.siwakorn.mvvmtemplate.domain.SimpleUseCase
import com.siwakorn.mvvmtemplate.domain.SimpleUseCaseImp
import org.koin.dsl.module

val useCaseModule = module {
    single<SimpleUseCase> { SimpleUseCaseImp(get()) }
}