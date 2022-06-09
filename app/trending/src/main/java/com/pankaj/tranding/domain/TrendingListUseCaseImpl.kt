package com.pankaj.tranding.domain

import com.pankaj.tranding.interactor.usecase.TrendingListUseCaseInterface
import com.pankaj.tranding.interactor.repository.TrendingRepositoryInterface

internal class TrendingListUseCaseImpl(private val trendingRepositoryInterface: TrendingRepositoryInterface) :
    TrendingListUseCaseInterface {
    override suspend fun invoke(input: TrendingListUseCaseInterface.TrendingInput): TrendingListUseCaseInterface.TrendingOutput {
        return TrendingListUseCaseInterface.TrendingOutput(trendingRepositoryInterface.getTrendingMovies())
    }
}