package com.pankaj.tranding.interactor.usecase

import com.pankaj.core.domain.SuspendingUseCase
import com.pankaj.tranding.framework.network.data.TrendingResponse
import com.pankaj.tranding.interactor.network.data.TrendingOutput

interface TrendingListUseCaseInterface :
    SuspendingUseCase<TrendingListUseCaseInterface.TrendingInput, TrendingListUseCaseInterface.TrendingOutput> {

    data class TrendingInput(
        val trendingType: String
    )

    data class TrendingOutput(
        val trendingList: com.pankaj.tranding.interactor.network.data.TrendingOutput?
    )
}