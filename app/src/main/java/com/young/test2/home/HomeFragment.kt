package com.young.test2.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.young.test2.R
import com.young.test2.databinding.FragmentHomeBinding
import com.young.test2.home.recyclerview.HomeRecyclerAdapter

class HomeFragment: Fragment() {
    private lateinit var _binding: FragmentHomeBinding
    val binding: FragmentHomeBinding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        val viewModel = ViewModelProvider(this).get(HomeFragmentViewModel::class.java)

        _binding.viewModel = viewModel
        _binding.lifecycleOwner = this

        return _binding.root
    }
}