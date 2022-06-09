package com.pankaj.core.domain

interface SuspendingUseCase<in inputT, out outPutT> {
    suspend fun invoke(input: inputT): outPutT
}