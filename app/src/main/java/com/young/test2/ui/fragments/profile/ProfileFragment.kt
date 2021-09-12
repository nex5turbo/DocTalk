package com.young.test2.ui.fragments.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.young.test2.databinding.FragmentExpertBinding
import com.young.test2.databinding.FragmentProfileBinding

class ProfileFragment: Fragment() {
    private lateinit var _binding: FragmentProfileBinding
    val binding: FragmentProfileBinding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProfileBinding.inflate(inflater, container, false)

        return _binding.root
    }
}