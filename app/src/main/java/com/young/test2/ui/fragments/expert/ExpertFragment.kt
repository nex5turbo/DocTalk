package com.young.test2.ui.fragments.expert

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.young.test2.databinding.FragmentExpertBinding

class ExpertFragment: Fragment() {
    private lateinit var _binding: FragmentExpertBinding
    val binding: FragmentExpertBinding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentExpertBinding.inflate(inflater, container, false)

        return _binding.root
    }
}