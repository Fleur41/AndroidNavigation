package com.okumu.androidnavigation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.okumu.androidnavigation.databinding.FragmentChatsBinding

class ChatsFragment: Fragment() {
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

        binding.message = "Hello from Chats Fragment"
        return binding.root
    }

    override fun onStart(){
        super.onStart()
        toast("On Start Chats Created")
    }

    override fun onResume(){
        super.onResume()
        toast("onResume Chats Called")
    }

    override fun onPause() {
        super.onPause()
        toast("onPause Chats Called")
    }

    override fun onStop() {
        super.onStop()
        toast("onStop Chats Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        toast("onDestroy Chats Called")
    }
    private fun toast(message: String){
        Toast.makeText(requireContext(), message, Toast.LENGTH_LONG).show()
    }
}