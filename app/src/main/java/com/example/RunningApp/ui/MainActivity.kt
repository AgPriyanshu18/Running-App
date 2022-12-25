package com.example.RunningApp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.RunningApp.DB.RunDAO
import com.example.RunningApp.R
import com.example.RunningApp.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private var binding : ActivityMainBinding ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

//        setSupportActionBar(binding?.toolbar)

        binding?.bottomNavigationView!!.setupWithNavController(
            findViewById<View>(R.id.navHostFrag).findNavController())

        findViewById<View>(R.id.navHostFrag).findNavController()
            .addOnDestinationChangedListener{
                _,dest,_ ->
                when(dest.id){
                    R.id.settingsFragment,R.id.runFragment,
                        R.id.statisticsFragment ->
                        binding?.bottomNavigationView?.visibility = View.VISIBLE
                    else-> binding?.bottomNavigationView?.visibility = View.GONE
                }
            }
    }
}