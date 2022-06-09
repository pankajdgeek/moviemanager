package com.pankaj.tranding.framework.di

import com.pankaj.tranding.domain.TrendingListUseCaseImpl
import com.pankaj.tranding.interactor.usecase.TrendingListUseCaseInterface
import org.koin.dsl.module

val useCaseModule = module {
    single { TrendingListUseCaseImpl(get()) as TrendingListUseCaseInterface }
}