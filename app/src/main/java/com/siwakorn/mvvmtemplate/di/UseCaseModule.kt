package com.siwakorn.mvvmtemplate.di

import com.siwakorn.mvvmtemplate.domain.GetListGenreMovieUseCase
import com.siwakorn.mvvmtemplate.domain.GetListGenreMovieUseCaseImp
import org.koin.dsl.module

val useCaseModule = module {
    single<GetListGenreMovieUseCase> { GetListGenreMovieUseCaseImp(get()) }
}