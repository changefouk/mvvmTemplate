package com.siwakorn.mvvmtemplate.data.repository

import com.siwakorn.mvvmtemplate.data.api.ApiService
import com.siwakorn.mvvmtemplate.data.model.response.GenreMovieListResponse
import com.siwakorn.mvvmtemplate.util.ResultResponse

interface RemoteDataSource {
    suspend fun getListGenreMovie(): ResultResponse<GenreMovieListResponse>
}

class RemoteDataSourceImp(
    private val api: ApiService
) : RemoteDataSource {

    override suspend fun getListGenreMovie(): ResultResponse<GenreMovieListResponse> =
        try {
            ResultResponse.success(api.getListGenreMovie())
        } catch (e: Exception) {
            ResultResponse.error(e)
        }

}