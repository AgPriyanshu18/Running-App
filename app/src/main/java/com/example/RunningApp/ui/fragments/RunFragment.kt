package com.example.RunningApp.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.RunningApp.R
import com.example.RunningApp.databinding.FragmentRunBinding
import com.example.RunningApp.ui.viewmodels.MainViewModal
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RunFragment : Fragment() {
    private val viewModal : MainViewModal by viewModels()

    private var binding : FragmentRunBinding ?= null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentRunBinding.inflate(layoutInflater)

        binding?.fab?.setOnClickListener {
            findNavController().navigate(R.id.action_runFragment_to_trackingFragment)
        }

        return binding?.root
    }
}