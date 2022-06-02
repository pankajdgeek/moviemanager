package com.pankaj.core.usecase

interface SuspendingUseCase<in inputT, out outPutT> {
    suspend fun invoke(input: inputT): outPutT
}