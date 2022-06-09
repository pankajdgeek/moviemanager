package com.pankaj.tranding.framework.network.data

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

class TrendingResponse {
    @SerializedName("page")
    @Expose
    var page: Int? = null

    @SerializedName("results")
    @Expose
    var results: List<Result>? = null

    @SerializedName("total_pages")
    @Expose
    var totalPages: Int? = null

    @SerializedName("total_results")
    @Expose
    var totalResults: Int? = null
}