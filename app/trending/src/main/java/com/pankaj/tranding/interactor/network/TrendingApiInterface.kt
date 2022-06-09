package com.pankaj.tranding.interactor.network

import com.pankaj.tranding.interactor.network.data.TrendingOutput

interface TrendingApiInterface {
    suspend fun getTrendingList(): TrendingOutput
}