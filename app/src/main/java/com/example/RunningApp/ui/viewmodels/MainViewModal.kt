package com.example.RunningApp.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.example.RunningApp.repositories.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModal @Inject constructor(
    val mainRepository: MainRepository
) : ViewModel(){
}