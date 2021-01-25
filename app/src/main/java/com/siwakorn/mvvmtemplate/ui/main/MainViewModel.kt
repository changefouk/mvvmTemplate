package com.siwakorn.mvvmtemplate.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.siwakorn.mvvmtemplate.data.model.response.GenreItem
import com.siwakorn.mvvmtemplate.data.model.response.Movie
import com.siwakorn.mvvmtemplate.domain.GetListGenreMovieUseCase
import com.siwakorn.mvvmtemplate.domain.GetMovieByGenreUseCase
import com.siwakorn.mvvmtemplate.util.StatusResult
import kotlinx.coroutines.launch

class MainViewModel(
    private val listGenreUseCase: GetListGenreMovieUseCase,
    private val discoverGenre: GetMovieByGenreUseCase
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
                listGenreUseCase.getListGenreMovie().let { result ->
                    if (result.isSuccess && result.data != null) {
                        _listGenre.value = result.data.genres
                        _statusResult.value = StatusResult.SUCCESS
                    } else {
                        // onError
                        _errorMessage.value = result.exception?.message
                        _statusResult.value = StatusResult.ERROR
                    }
                }
            }
        }
    }

    suspend fun discoverGenre(genreId: Int): List<Movie>? {
        viewModelScope.launch {
            discoverGenre.getListMovieByGenre(genreId).let { result ->
                if (result.isSuccess && result.data != null) {
                    result.data.result
                } else {
                    null
                }
            }
        }
        return null
    }
}