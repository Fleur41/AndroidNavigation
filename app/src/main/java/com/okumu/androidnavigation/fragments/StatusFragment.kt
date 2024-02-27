package com.okumu.androidnavigation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.okumu.androidnavigation.databinding.FragmentChatsBinding

class StatusFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentChatsBinding = FragmentChatsBinding.inflate(
            inflater,
            container,
            false
        )
        binding.message = "Hujambo kutoka fragment la Status"
        return binding.root
    }
}