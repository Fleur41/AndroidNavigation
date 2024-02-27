package com.okumu.androidnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.okumu.androidnavigation.databinding.ActivityWhatsAppBinding

class WhatsAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityWhatsAppBinding = DataBindingUtil.setContentView(this, R.layout.activity_whats_app)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentHost) as NavHostFragment

        val navController = navHostFragment.navController

        binding.btnChats.setOnClickListener{
            navController.navigate(R.id.chatsFragment)
        }

        binding.btnStatus.setOnClickListener{
            navController.navigate(R.id.statusFragment)
        }

        binding.btnCalls.setOnClickListener{
            navController.navigate(R.id.callsFragment)
        }
    }
}