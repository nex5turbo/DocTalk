package com.young.test2.ui.fragments.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModelProvider
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.young.test2.databinding.FragmentHomeBinding

class HomeFragment: Fragment() {
    private lateinit var _binding: FragmentHomeBinding
    val binding: FragmentHomeBinding get() = _binding
    val viewModel: HomeFragmentViewModel by
        lazy{ ViewModelProvider(requireActivity()).get(HomeFragmentViewModel::class.java) }

    val refeshListener = SwipeRefreshLayout.OnRefreshListener {
        viewModel.getList()
    }
    val TAG = "HomeFragment"

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        _binding.viewModel = viewModel
        _binding.lifecycleOwner = viewLifecycleOwner

        _binding.homeRefreshLayout.setOnRefreshListener(refeshListener)

        viewModel.homeItemList.observe(viewLifecycleOwner, {
            _binding.homeRefreshLayout.isRefreshing = false
        })

        return _binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy()")
    }
}