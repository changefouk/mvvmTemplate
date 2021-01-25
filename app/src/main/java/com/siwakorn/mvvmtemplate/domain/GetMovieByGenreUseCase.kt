package com.siwakorn.mvvmtemplate.domain

import com.siwakorn.mvvmtemplate.data.model.response.DiscoverGenre
import com.siwakorn.mvvmtemplate.data.repository.DataRepository
import com.siwakorn.mvvmtemplate.util.ResultResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

interface GetMovieByGenreUseCase {
    suspend fun getListMovieByGenre(genreId: Int): ResultResponse<DiscoverGenre>
}

class GetMovieByGenreUseCaseImp(
    private val repository: DataRepository
) : GetMovieByGenreUseCase {

    override suspend fun getListMovieByGenre(genreId: Int): ResultResponse<DiscoverGenre> =
        withContext(Dispatchers.IO) {
            repository.getMovieByGenre(genreId)
        }

}