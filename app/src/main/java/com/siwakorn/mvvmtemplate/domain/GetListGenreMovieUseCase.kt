package com.siwakorn.mvvmtemplate.domain

import com.siwakorn.mvvmtemplate.data.model.response.GenreMovieListResponse
import com.siwakorn.mvvmtemplate.data.repository.DataRepository
import com.siwakorn.mvvmtemplate.util.ResultResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

interface GetListGenreMovieUseCase {
    suspend fun getListGenreMovie(): ResultResponse<GenreMovieListResponse>
}

class GetListGenreMovieUseCaseImp(
    private val repository: DataRepository
) : GetListGenreMovieUseCase {

    override suspend fun getListGenreMovie(): ResultResponse<GenreMovieListResponse> =
        withContext(Dispatchers.IO) {
            repository.getListGenreMovie()
        }

}