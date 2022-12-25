package com.example.RunningApp.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.RunningApp.R
import com.example.RunningApp.ui.viewmodels.MainViewModal
import com.example.RunningApp.ui.viewmodels.StaticsViewModal
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class statisticsFragment : Fragment(R.layout.fragment_statistics) {
    private val viewModal : StaticsViewModal by viewModels()
}