package com.pankaj.moviemanager.framework.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.pankaj.moviemanager.R

class MainActivity : AppCompatActivity() {
    val className: String
        get() = "com.pankaj.tranding.framework.ui.TrendingFragment"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showTrendingFragment()
    }

    private fun showTrendingFragment() {
        val fragment = Class.forName(className).newInstance() as Fragment
        supportFragmentManager.beginTransaction().add(R.id.container, fragment, "trending").commit()
    }
}