package com.pankaj.tranding.framework.mapper

import com.pankaj.tranding.framework.network.data.TrendingResponse
import com.pankaj.tranding.interactor.network.data.TrendingOutput

fun TrendingResponse.asTrendingOutput(): TrendingOutput {
    return TrendingOutput(this.results?.get(0)?.overview)
}
