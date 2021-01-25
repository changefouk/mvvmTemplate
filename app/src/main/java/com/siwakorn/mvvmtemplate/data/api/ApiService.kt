package com.siwakorn.mvvmtemplate.data.api


import com.siwakorn.mvvmtemplate.constant.ApiConstant
import com.siwakorn.mvvmtemplate.data.base.BaseResponse
import com.siwakorn.mvvmtemplate.data.model.response.DiscoverGenre
import com.siwakorn.mvvmtemplate.data.model.response.GenreMovieListResponse
import com.siwakorn.mvvmtemplate.util.ResultResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET(ApiConstant.EndPoint.API_GENE_MOVIE_LIST)
    suspend fun getListGenreMovie(): GenreMovieListResponse

    @GET(ApiConstant.EndPoint.API_DISCOVER_MOVIE)
    suspend fun getMovieByGenre(
        @Query(value = ApiConstant.Value.GENRE_ID) genreId: Int
    ): DiscoverGenre
}