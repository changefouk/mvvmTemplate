package com.siwakorn.mvvmtemplate.data.repository

import com.siwakorn.mvvmtemplate.data.api.ApiService
import com.siwakorn.mvvmtemplate.util.ResultResponse

interface RemoteDataSource {
    suspend fun getSomeThing(): ResultResponse<Any>
}

class RemoteDataSourceImp(
    private val api: ApiService
) : RemoteDataSource {

    override suspend fun getSomeThing(): ResultResponse<Any> =
        try {
            ResultResponse.success(api.getSomeThing())
        } catch (e: Exception) {
            ResultResponse.error(e)
        }

}