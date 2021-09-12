package com.young.test2.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.young.test2.R
import com.young.test2.databinding.ActivityMainBinding
import com.young.test2.utils.Display

class MainActivity : AppCompatActivity() {
    private lateinit var _binding: ActivityMainBinding
    private val viewModel: MainActivityViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Display.initDM(applicationContext)
        _binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        _binding.viewModel = viewModel
        _binding.lifecycleOwner = this

        setBottomNavigationView()
    }

    private fun setBottomNavigationView() {
        val navHomeFragment = supportFragmentManager.findFragmentById(R.id.mainNavigation) as NavHostFragment
        val navController = navHomeFragment.navController

        NavigationUI.setupWithNavController(_binding.bottomNavigationView, navController)

        _binding.bottomNavigationView.setupWithNavController(navController)

        navController.addOnDestinationChangedListener { controller, destination, arguments ->
            when(destination.id) {
                R.id.navigation_home -> viewModel.setTitle(getString(R.string.title_home))
                R.id.navigation_profile -> viewModel.setTitle(getString(R.string.title_profile))
                R.id.navigation_consult -> viewModel.setTitle(getString(R.string.title_consult))
                R.id.navigation_expert -> viewModel.setTitle(getString(R.string.title_expert))
                R.id.navigation_diagnosis -> viewModel.setTitle(getString(R.string.title_diagnosis))
            }
        }
    }
}