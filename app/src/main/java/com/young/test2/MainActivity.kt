package com.young.test2

import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.young.test2.databinding.ActivityMainBinding
import com.young.test2.home.HomeFragment

class MainActivity : AppCompatActivity() {
    private lateinit var _binding: ActivityMainBinding
    val homeFragment = HomeFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        _binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        _binding.bottomNavigationView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.navigation_home -> {
                    supportFragmentManager.beginTransaction().replace(R.id.mainContent, homeFragment).commit()
                    true
                }
            }
            false
        }
        _binding.bottomNavigationView.selectedItemId = R.id.navigation_home
    }
}