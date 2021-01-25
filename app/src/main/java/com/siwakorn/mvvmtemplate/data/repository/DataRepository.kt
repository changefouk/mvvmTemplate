package com.siwakorn.mvvmtemplate.data.repository

import com.siwakorn.mvvmtemplate.data.model.response.DiscoverGenre
import com.siwakorn.mvvmtemplate.data.model.response.GenreMovieListResponse
import com.siwakorn.mvvmtemplate.util.ResultResponse

interface DataRepository {
    suspend fun getListGenreMovie(): ResultResponse<GenreMovieListResponse>
    suspend fun getMovieByGenre(genreId: Int): ResultResponse<DiscoverGenre>
}

class DataRepositoryImp(
    private val localDataSource: LocalDataSource,
    private val remoteDataSource: RemoteDataSource
) : DataRepository {

    override suspend fun getListGenreMovie(): ResultResponse<GenreMovieListResponse> =
        remoteDataSource.getListGenreMovie()

    override suspend fun getMovieByGenre(genreId: Int): ResultResponse<DiscoverGenre> =
        remoteDataSource.getMovieByGenre(genreId)

}