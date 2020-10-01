package com.siwakorn.mvvmtemplate.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.siwakorn.mvvmtemplate.data.model.response.GenreItem
import com.siwakorn.mvvmtemplate.domain.GetListGenreMovieUseCase
import com.siwakorn.mvvmtemplate.util.StatusResult
import kotlinx.coroutines.launch

class MainViewModel(
    private val useCase: GetListGenreMovieUseCase
) : ViewModel() {

    private val _listGenre = MutableLiveData<List<GenreItem>>()
    val listGenre: LiveData<List<GenreItem>>
        get() = _listGenre

    private val _statusResult = MutableLiveData<StatusResult>()
    val statusResult: LiveData<StatusResult>
        get() = _statusResult

    private val _errorMessage = MutableLiveData<String>()
    val errorMessage: LiveData<String>
        get() = _errorMessage

    fun fetchData() {
        viewModelScope.launch {
            if (statusResult.value != StatusResult.SUCCESS) {
                _statusResult.value = StatusResult.LOADING
                useCase.getListGenreMovie().let { result ->
                    if (result.isSuccess && result.data != null) {
                        _listGenre.value = result.data.genres
                    } else {
                        // onError
                        _errorMessage.value = result.exception?.message
                        _statusResult.value = StatusResult.ERROR
                    }
                }
            }
        }
    }

}