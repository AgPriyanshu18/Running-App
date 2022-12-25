package com.example.RunningApp.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.RunningApp.R
import com.example.RunningApp.databinding.FragmentSetupBinding

class SetUpFragment : Fragment() {

    private var binding : FragmentSetupBinding ?= null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSetupBinding.inflate(layoutInflater)

        binding?.tvContinue?.setOnClickListener {
            findNavController().navigate(R.id.action_setUpFragment_to_runFragment)
        }

        return binding?.root
    }
}