package com.siwakorn.mvvmtemplate.data.repository

import com.siwakorn.mvvmtemplate.util.ResultResponse

interface LocalDataSource {
    fun getSomeThing(): ResultResponse<Any>
}

class LocalDataSourceImp() : LocalDataSource {

    override fun getSomeThing(): ResultResponse<Any> {
        return ResultResponse.success(Any())
    }

}