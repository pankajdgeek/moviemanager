package com.pankaj.core.framework.di

import com.pankaj.core.framework.LocalStorage.LocalStore
import com.pankaj.core.interactor.LocalStoreInterface
import org.koin.dsl.module

val localStoreModule = module {
    single {
        LocalStore(get(), LocalStoreInterface.LocalStoreType.APPLICATION)
    }
}