package com.okumu.androidnavigation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
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

    override fun onStart(){
        super.onStart()
        toast("On Start Status Created")
    }

    override fun onResume(){
        super.onResume()
        toast("onResume Status Called")
    }

    override fun onPause() {
        super.onPause()
        toast("onPause Status Called")
    }

    override fun onStop() {
        super.onStop()
        toast("onStop Status Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        toast("onDestroy Status Called")
    }
    private fun toast(message: String){
        Toast.makeText(requireContext(), message, Toast.LENGTH_LONG).show()
    }
}