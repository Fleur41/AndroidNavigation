package com.okumu.androidnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.okumu.androidnavigation.databinding.ActivityEmailBinding

class EmailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityEmailBinding = DataBindingUtil.setContentView(this, R.layout.activity_email)

        //retrieve value sent by intent
        val email = intent.getStringExtra("EMAIL")
        //set email in the binding object
        binding.email = email
    }
}