package com.okumu.androidnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.okumu.androidnavigation.databinding.ActivityWhatsAppBinding

class WhatsAppActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        lifecycle.addObserver(ToastObserver(this))
        //toast("onCreate called")
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

    
    override fun onStart(){
        super.onStart()
        toast("On Start Created")
    }

    override fun onResume(){
        super.onResume()
        toast("onResume Called")
    }

    override fun onPause() {
        super.onPause()
        toast("onPause Called")
    }

    override fun onStop() {
        super.onStop()
        toast("onStop Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        toast("onDestroy Called")
    }
    //utility function for showing a toast message
    private fun toast(message: String){
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}

