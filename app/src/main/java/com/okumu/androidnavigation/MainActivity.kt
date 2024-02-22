package com.okumu.androidnavigation

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.view.menu.MenuBuilder
import androidx.databinding.DataBindingUtil
import com.okumu.androidnavigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    @SuppressLint("RestrictedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //creates an object that is responsible for opening and closing of our drawer
        val drawerToggle = ActionBarDrawerToggle(
            this,
            binding.mainDrawer,
            R.string.nav_open,
            R.string.nav_close
        )

        binding.mainDrawer.addDrawerListener(drawerToggle)
        drawerToggle.syncState()

        //make drawer icon to always appear
        supportActionBar?.setDefaultDisplayHomeAsUpEnabled(true)

        binding.btnSendEmail.setOnClickListener {
            val email = binding.edtEmail.text.toString()

            // a. explicit intent
            //Logic for navigating to email page
            // 1. Create an intent object
//            val intent = Intent(this, EmailActivity::class.java)
            // 2. (Optional) Passing data to the next activity(key value format)
//            intent.putExtra("EMAIL", email)
            // 3. Start navigating
//            startActivity(intent)


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

     // logic for creation of the menu
    @SuppressLint("RestrictedApi")
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        if(menu is MenuBuilder){
            menu.setOptionalIconsVisible(true)
        }
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    //add functionality to the menu
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.menu_settings -> {
                //show toast message
                Toast.makeText(
                    this,
                    "You have clicked settings",
                    Toast.LENGTH_SHORT).show()
            }
            R.id.menu_exit -> {
                //close activity
                finish()
            }
        }
        return true
    }
}