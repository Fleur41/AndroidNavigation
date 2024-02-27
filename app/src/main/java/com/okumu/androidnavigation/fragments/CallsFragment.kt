package com.okumu.androidnavigation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.okumu.androidnavigation.databinding.FragmentCallsBinding

class CallsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding : FragmentCallsBinding = FragmentCallsBinding.inflate(
            inflater,
            container,
            false
        )
        binding.message = "Hello from Calls Fragment"
        return binding.root
    }
}