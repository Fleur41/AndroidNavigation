package com.okumu.androidnavigation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
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

    override fun onStart(){
        super.onStart()
        toast("On Start Calls Created")
    }

    override fun onResume(){
        super.onResume()
        toast("onResume Calls Called")
    }

    override fun onPause() {
        super.onPause()
        toast("onPause Calls Called")
    }

    override fun onStop() {
        super.onStop()
        toast("onStop Calls Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        toast("onDestroy Calls Called")
    }
    private fun toast(message: String){
        Toast.makeText(requireContext(), message, Toast.LENGTH_LONG).show()
    }
}