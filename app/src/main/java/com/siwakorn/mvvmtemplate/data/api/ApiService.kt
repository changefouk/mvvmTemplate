package com.siwakorn.mvvmtemplate.data.api


import com.siwakorn.mvvmtemplate.constant.ApiConstant
import com.siwakorn.mvvmtemplate.data.base.BaseResponse
import retrofit2.http.GET

interface ApiService {

    @GET(ApiConstant.EndPoint.API)
    suspend fun getProfile(): BaseResponse // change Base Response to model when use
}