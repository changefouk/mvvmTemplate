package com.siwakorn.mvvmtemplate.data.api


import com.siwakorn.mvvmtemplate.constant.ApiConstant
import com.siwakorn.mvvmtemplate.data.base.BaseResponse
import com.siwakorn.mvvmtemplate.data.model.response.GenreMovieListResponse
import com.siwakorn.mvvmtemplate.util.ResultResponse
import retrofit2.http.GET

interface ApiService {

    @GET(ApiConstant.EndPoint.API_GENE_MOVIE_LIST)
    suspend fun getListGenreMovie(): GenreMovieListResponse
}