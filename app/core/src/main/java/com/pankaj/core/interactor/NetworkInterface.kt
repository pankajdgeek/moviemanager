package com.pankaj.core.interactor

interface NetworkInterface {
    fun <T> create(service:Class<T>): T
}