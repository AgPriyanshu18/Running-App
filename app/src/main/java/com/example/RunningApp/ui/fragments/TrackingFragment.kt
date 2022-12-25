package com.example.RunningApp.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.RunningApp.R
import com.example.RunningApp.ui.viewmodels.MainViewModal
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TrackingFragment : Fragment(R.layout.fragment_tracking) {
    private val viewModal : MainViewModal by viewModels()
}