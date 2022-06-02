package com.pankaj.core.framework.network

import android.content.Context
import com.pankaj.core.BuildConfig
import com.pankaj.core.interactor.NetworkInterface
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.java.KoinJavaComponent.get
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

internal object NetworkingInstance : NetworkInterface {
    fun getNetworkInstance(context: Context): Retrofit {
        val okHttpClient = getHttpClient(context)
        return Retrofit.Builder()
            .baseUrl("https://api.themoviedb.org/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()
    }

    private fun getHttpClient(context: Context): OkHttpClient {
        val httpClient = OkHttpClient.Builder()

        if (BuildConfig.DEBUG) {
            httpClient.addInterceptor(getLoggerInterceptor())
        }
        return httpClient.build()
    }

    private fun getLoggerInterceptor(): HttpLoggingInterceptor {
        return HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
    }

    override fun <T> create(service: Class<T>): T {
        return (get(Retrofit::class.java) as Retrofit).create(service)
    }
}