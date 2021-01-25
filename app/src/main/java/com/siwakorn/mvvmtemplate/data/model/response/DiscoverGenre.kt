package com.siwakorn.mvvmtemplate.data.model.response

import com.google.gson.annotations.SerializedName


data class DiscoverGenre(
    @SerializedName("results") var result: List<Movie>
)

data class Movie(
    @SerializedName("title") var title: String,
    @SerializedName("poster_path") var poster_path: String,
)
//{
//    "page": 1,
//    "total_results": 10000,
//    "total_pages": 500,
//    "results": [
//    {
//        "popularity": 2580.212,
//        "vote_count": 45,
//        "video": false,
//        "poster_path": "/6CoRTJTmijhBLJTUNoVSUNxZMEI.jpg",
//        "id": 694919,
//        "adult": false,
//        "backdrop_path": "/pq0JSpwyT2URytdFG0euztQPAyR.jpg",
//        "original_language": "en",
//        "original_title": "Money Plane",
//        "genre_ids": [
//        28
//        ],
//        "title": "Money Plane",
//        "vote_average": 5.4,
//        "overview": "A professional thief with $40 million in debt and his family's life on the line must commit one final heist - rob a futuristic airborne casino filled with the world's most dangerous criminals.",
//        "release_date": "2020-09-29"
//    }