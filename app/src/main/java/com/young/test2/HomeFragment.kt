package com.young.test2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.young.test2.databinding.FragmentHomeBinding

class HomeFragment: Fragment() {
    private lateinit var _binding: FragmentHomeBinding
    val binding: FragmentHomeBinding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)

        return _binding.root
    }
}