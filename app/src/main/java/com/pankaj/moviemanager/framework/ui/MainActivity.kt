package com.pankaj.moviemanager.framework.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pankaj.core.interactor.LocalStoreInterface
import com.pankaj.moviemanager.R
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {
    val localStore :LocalStoreInterface by inject()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}