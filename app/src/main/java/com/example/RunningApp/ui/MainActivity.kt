package com.example.RunningApp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.RunningApp.DB.RunDAO
import com.example.RunningApp.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var runDOA : RunDAO

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
}