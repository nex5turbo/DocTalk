package com.young.test2.ui.fragments.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.young.test2.databinding.FragmentHomeBinding

class HomeFragment: Fragment() {
    private lateinit var _binding: FragmentHomeBinding
    val binding: FragmentHomeBinding get() = _binding
    val TAG = "HomeFragment"
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val viewModel = ViewModelProvider(requireActivity()).get(HomeFragmentViewModel::class.java)

        _binding.viewModel = viewModel
        _binding.lifecycleOwner = viewLifecycleOwner

        return _binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy()")
    }
}