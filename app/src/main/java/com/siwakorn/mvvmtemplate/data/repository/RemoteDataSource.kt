package com.siwakorn.mvvmtemplate.data.repository

import com.siwakorn.mvvmtemplate.data.api.ApiService
import com.siwakorn.mvvmtemplate.data.model.response.DiscoverGenre
import com.siwakorn.mvvmtemplate.data.model.response.GenreMovieListResponse
import com.siwakorn.mvvmtemplate.util.ResultResponse

interface RemoteDataSource {
    suspend fun getListGenreMovie(): ResultResponse<GenreMovieListResponse>
    suspend fun getMovieByGenre(genreId: Int): ResultResponse<DiscoverGenre>
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

    override suspend fun getMovieByGenre(genreId: Int): ResultResponse<DiscoverGenre> =
        try {
            ResultResponse.success(api.getMovieByGenre(genreId))
        } catch (e: Exception) {
            ResultResponse.error(e)
        }

}