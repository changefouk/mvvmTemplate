package com.siwakorn.mvvmtemplate.data.model.response

import com.google.gson.annotations.SerializedName
import com.siwakorn.mvvmtemplate.data.base.BaseResponse

data class GenreMovieListResponse(
    @SerializedName("genres") var genres: List<GenreItem>
) : BaseResponse()

data class GenreItem(
    @SerializedName("id") var id: Int,
    @SerializedName("name") var name: String
)