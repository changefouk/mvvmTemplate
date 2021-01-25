package com.siwakorn.mvvmtemplate.di

import com.siwakorn.mvvmtemplate.domain.GetListGenreMovieUseCase
import com.siwakorn.mvvmtemplate.domain.GetListGenreMovieUseCaseImp
import com.siwakorn.mvvmtemplate.domain.GetMovieByGenreUseCase
import com.siwakorn.mvvmtemplate.domain.GetMovieByGenreUseCaseImp
import org.koin.dsl.module

val useCaseModule = module {
    single<GetListGenreMovieUseCase> { GetListGenreMovieUseCaseImp(get()) }
    single<GetMovieByGenreUseCase> { GetMovieByGenreUseCaseImp(get()) }
}