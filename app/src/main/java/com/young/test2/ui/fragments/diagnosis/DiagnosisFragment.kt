package com.young.test2.ui.fragments.diagnosis

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.young.test2.databinding.FragmentDiagnosisBinding

class DiagnosisFragment: Fragment() {
    private lateinit var _binding: FragmentDiagnosisBinding
    val binding: FragmentDiagnosisBinding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDiagnosisBinding.inflate(inflater, container, false)

        return _binding.root
    }
}