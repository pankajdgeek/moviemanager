package com.pankaj.tranding.domain

import com.pankaj.tranding.framework.network.data.TrendingResponse
import com.pankaj.tranding.interactor.network.TrendingApiInterface
import com.pankaj.tranding.interactor.network.data.TrendingOutput
import com.pankaj.tranding.interactor.repository.TrendingRepositoryInterface

class TrendingRepositoryImpl(private val trendingApiInterface: TrendingApiInterface) :
    TrendingRepositoryInterface {
    override suspend fun getTrendingMovies(): TrendingOutput {
        return trendingApiInterface.getTrendingList()
    }

    override suspend fun getTrendingFromDB(): TrendingOutput? {
        TODO("Not yet implemented")
    }
}