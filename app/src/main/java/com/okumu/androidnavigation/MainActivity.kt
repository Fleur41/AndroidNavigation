package com.okumu.androidnavigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.okumu.androidnavigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btnSendEmail.setOnClickListener {
            val email = binding.edtEmail.text.toString()

            // a. explicit intent
            //Logic for navigating to email page
            // 1. Create an intent object
            val intent = Intent(this, EmailActivity::class.java)
            // 2. (Optional) Passing data to the next activity(key value format)
            intent.putExtra("EMAIL", email)
            // 3. Start navigating
            startActivity(intent)


            // b. Implicit intent
            //Logic for implicit intent
            // 1. Create an implicit object
            val implicitIntent = Intent(Intent.ACTION_SEND)
            // 2. (Optional) provide extra data and parameters
            implicitIntent.type = "text/plain"
            implicitIntent.putExtra(Intent.EXTRA_EMAIL, email)
            implicitIntent.putExtra(Intent.EXTRA_TEXT, "Hello from Android")
            // 3. start your navigation
            if(implicitIntent.resolveActivity(packageManager) != null){
                startActivity(implicitIntent)
            }
        }
    }
}