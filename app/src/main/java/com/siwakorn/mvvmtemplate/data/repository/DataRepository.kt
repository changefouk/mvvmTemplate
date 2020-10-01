package com.siwakorn.mvvmtemplate.data.repository

import com.siwakorn.mvvmtemplate.util.ResultResponse

interface DataRepository {
    suspend fun getSomeThing(): ResultResponse<Any>
}

class DataRepositoryImp(
    private val localDataSource: LocalDataSource,
    private val remoteDataSource: RemoteDataSource
) : DataRepository {

    override suspend fun getSomeThing(): ResultResponse<Any> =
        remoteDataSource.getSomeThing()

}