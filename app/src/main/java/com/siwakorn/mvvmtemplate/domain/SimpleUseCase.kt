package com.siwakorn.mvvmtemplate.domain

import com.siwakorn.mvvmtemplate.data.repository.DataRepository
import com.siwakorn.mvvmtemplate.util.ResultResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

interface SimpleUseCase {
    suspend fun getSomeThing(): ResultResponse<Any>
}

class SimpleUseCaseImp(
    private val repository: DataRepository
) : SimpleUseCase {

    override suspend fun getSomeThing(): ResultResponse<Any> = withContext(Dispatchers.IO) {
        repository.getSomeThing()
    }

}