package com.pankaj.tranding.interactor.repository

import com.pankaj.tranding.interactor.network.data.TrendingOutput

interface TrendingRepositoryInterface {
    suspend fun getTrendingMovies(): TrendingOutput?
    suspend fun getTrendingFromDB(): TrendingOutput?
}