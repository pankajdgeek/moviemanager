package com.pankaj.tranding.framework.network

import com.pankaj.tranding.framework.network.data.TrendingResponse
import com.pankaj.tranding.interactor.network.TrendingApiInterface
import retrofit2.http.GET

interface TrendingApi  {
    @GET("3/trending/movie/day")
    suspend fun getTrendingList(): TrendingResponse
}