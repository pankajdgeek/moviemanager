package com.pankaj.core.framework.network

import com.pankaj.core.interactor.NetworkInterface
import org.koin.dsl.module


val networkModule = module {
    single { NetworkingInstance.getNetworkInstance(get()) }
    single { NetworkingInstance as NetworkInterface }
}

