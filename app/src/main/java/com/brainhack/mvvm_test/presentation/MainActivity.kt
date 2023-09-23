package com.brainhack.mvvm_test.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.brainhack.mvvm_test.R
import com.brainhack.mvvm_test.presentation.ui.fragments.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }
}