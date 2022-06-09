package com.pankaj.tranding.framework.di

import com.pankaj.core.interactor.NetworkInterface
import com.pankaj.tranding.domain.TrendingRepositoryImpl
import com.pankaj.tranding.framework.network.TrendingApi
import com.pankaj.tranding.framework.network.TrendingApiImpl
import com.pankaj.tranding.framework.viewmodel.TrendingViewModel
import com.pankaj.tranding.interactor.network.TrendingApiInterface
import com.pankaj.tranding.interactor.repository.TrendingRepositoryInterface
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val repoModule = module {
    single { (get() as NetworkInterface).create(TrendingApi::class.java) }
    single { TrendingApiImpl(get()) as TrendingApiInterface}
    single { TrendingRepositoryImpl(get()) as TrendingRepositoryInterface }
    viewModel { TrendingViewModel(get()) }
}