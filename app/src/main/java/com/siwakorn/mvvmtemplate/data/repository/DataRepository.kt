package com.siwakorn.mvvmtemplate.data.repository

import com.siwakorn.mvvmtemplate.data.model.response.GenreMovieListResponse
import com.siwakorn.mvvmtemplate.util.ResultResponse

interface DataRepository {
    suspend fun getListGenreMovie(): ResultResponse<GenreMovieListResponse>
}

class DataRepositoryImp(
    private val localDataSource: LocalDataSource,
    private val remoteDataSource: RemoteDataSource
) : DataRepository {

    override suspend fun getListGenreMovie(): ResultResponse<GenreMovieListResponse> =
        remoteDataSource.getListGenreMovie()

}