package com.pankaj.core.framework.network

import org.koin.dsl.module


val networkModule = module {
    single { NetworkingInstance.getNetworkInstance(get()) }
}

