package com.pankaj.core.interactor

interface LocalStoreInterface {
    suspend fun <T> putValue(key: String, value: T)
    suspend fun <T> getValue(key: String, default: T): T
    enum class LocalStoreType {
        APPLICATION
    }
}