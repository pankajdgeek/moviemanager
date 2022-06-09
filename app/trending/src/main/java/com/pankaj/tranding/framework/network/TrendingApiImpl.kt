package com.pankaj.tranding.framework.network

import com.pankaj.tranding.framework.mapper.asTrendingOutput
import com.pankaj.tranding.interactor.network.TrendingApiInterface
import com.pankaj.tranding.interactor.network.data.TrendingOutput

class TrendingApiImpl(private val trendingApi: TrendingApi) : TrendingApiInterface {
    override suspend fun getTrendingList(): TrendingOutput {
        return trendingApi.getTrendingList().asTrendingOutput()
    }
}