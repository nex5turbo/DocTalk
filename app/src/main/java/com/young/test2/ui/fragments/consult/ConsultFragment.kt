package com.young.test2.ui.fragments.consult

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.young.test2.databinding.FragmentConsultBinding

class ConsultFragment: Fragment() {
    private lateinit var _binding: FragmentConsultBinding
    val binding: FragmentConsultBinding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentConsultBinding.inflate(inflater, container, false)

        return _binding.root
    }
}