package com.example.RunningApp.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.RunningApp.R
import com.example.RunningApp.ui.viewmodels.MainViewModal
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RunFragment : Fragment(R.layout.fragment_run) {
    private val viewModal : MainViewModal by viewModels()
}